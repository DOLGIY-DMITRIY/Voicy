package com.voicybot.io.statemachine.applier

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.voicybot.io.statemachine.ExecutionOutput
import com.voicybot.io.statemachine.Input
import com.voicybot.io.statemachine.state.State

class Start : Applier {
    override fun apply(bot: Bot, input: Input): ExecutionOutput? {
        if (input.update().message!!.text.equals("/start")){
            bot.sendMessage(ChatId.fromId(input.id()), "Hi")

            return ExecutionOutput(State.START, "")
        }

        return null
    }
}