package xyz.sidetrip.banutil.commands.general;

import sx.blah.discord.Discord4J;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.util.EmbedBuilder;
import xyz.sidetrip.banutil.BanUtil;
import xyz.sidetrip.banutil.Emojis;
import xyz.sidetrip.banutil.UtilDue;
import xyz.sidetrip.banutil.commands.Command;

import java.util.Calendar;

public class Info extends Command {

    public Info() {
        super("info");
    }

    @Override
    public void execute(IMessage context, String... args) {
        EmbedBuilder info = new EmbedBuilder();
        info.withTitle(Emojis.BAN + " | RCDV2");
        info.withColor(BanUtil.BANNING_COLOUR);
        info.withDescription("I'm **RCDBOT** (a RCD moderation bot) by RCDForum Team\n"
                + "I have come here to chew ram and ban noobs..."
                + " and I'm all out of server ram.");
        info.appendField("RCD version", BanUtil.VERSION, true);
        info.appendField("Discord4J version", Discord4J.VERSION, true);
        context.getChannel().sendMessage(info.build());
    }

    @Override
    public String toString() {
        return super.toString()+" - shows bot info";
    }

}
