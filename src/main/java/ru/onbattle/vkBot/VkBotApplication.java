package ru.onbattle.vkBot;

import com.vk.api.sdk.exceptions.ApiException;
import ru.onbattle.vkBot.core.VKServer;

public class VkBotApplication {

	public static void main(String[] args) throws ApiException, InterruptedException {
		VKServer.serverStart();
	}
}
