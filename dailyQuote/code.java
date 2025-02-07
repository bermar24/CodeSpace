//package dailyQuote;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.Random;
//
//public class ZenQuote extends Application {
//
//    private Label quoteLabel;
//    private Button[] answerButtons = new Button[4];
//    private String correctAuthor;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        // UI setup
//        quoteLabel = new Label("Fetching quote...");
//        VBox vbox = new VBox(10);
//        vbox.getChildren().add(quoteLabel);
//
//        for (int i = 0; i < 4; i++) {
//            answerButtons[i] = new Button("Answer " + (i + 1));
//            int finalI = i;
//            answerButtons[i].setOnAction(e -> checkAnswer(finalI));
//            vbox.getChildren().add(answerButtons[i]);
//        }
//
//        Scene scene = new Scene(vbox, 300, 250);
//        primaryStage.setTitle("Zen Quote Guessing Game");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//        // Fetch quote data
//        fetchQuote();
//    }
//
//    // Fetch the quote and authors from the API
//    private void fetchQuote() {
//        try {
//            URL url = new URL("https://api.quotable.io/random");  // API to get random quotes
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
//            StringBuilder response = new StringBuilder();
//            int i;
//            while ((i = reader.read()) != -1) {
//                response.append((char) i);
//            }
//
//            // Parse JSON response
//            JSONObject jsonResponse = new JSONObject(response.toString());
//            String quote = jsonResponse.getString("content");
//            correctAuthor = jsonResponse.getString("author");
//
//            // Display quote
//            quoteLabel.setText(quote);
//
//            // Prepare multiple choice answers
//            prepareAnswers(correctAuthor);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Prepare the multiple-choice answers
//    private void prepareAnswers(String correctAuthor) {
//        // Dummy authors for the sake of demonstration
//        String[] authors = {"Buddha", "Laozi", "Socrates", "Confucius"};
//        authors[new Random().nextInt(4)] = correctAuthor;  // Set one correct author
//
//        // Shuffle the options
//        Random rand = new Random();
//        for (int i = 0; i < answerButtons.length; i++) {
//            int randomIndex = rand.nextInt(4);
//            answerButtons[i].setText(authors[randomIndex]);
//            authors[randomIndex] = authors[3];  // Avoid reusing the same author
//        }
//    }
//
//    // Check the user's answer
//    private void checkAnswer(int selectedOption) {
//        String selectedAuthor = answerButtons[selectedOption].getText();
//        if (selectedAuthor.equals(correctAuthor)) {
//            quoteLabel.setText("Correct! " + correctAuthor);
//        } else {
//            quoteLabel.setText("Incorrect. The correct author is " + correctAuthor);
//        }
//
//        // Fetch new quote after a delay (or immediately for simplicity)
//        fetchQuote();
//    }
//}
