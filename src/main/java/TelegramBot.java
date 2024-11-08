import services.ChatGPTService;

public class TelegramBot {
    public static final String TELEGRAM_BOT_NAME =  "invest_bot_vadim_bot";
    public static final String TELEGRAM_BOT_TOKEN = "7377697976:AAG8qn1QkyYkU50wqTj24pkh4IGQpLeZDUs";
    public static final String OPEN_AI_TOKEN = "gpt:y8HQgXidYWEPQ52jBuwnJFkblB3T8AScAHOTiNP46pG97Qae";

    private ChatGPTService chatGpt = new ChatGPTService(OPEN_AI_TOKEN);
    public TelegramBot() {
        super(TELEGRAM_BOT_NAME, TELEGRAM_BOT_TOKEN);
    }


}
