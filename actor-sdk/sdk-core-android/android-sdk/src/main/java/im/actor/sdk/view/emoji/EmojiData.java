/*
 * This is the source code of Telegram for Android v. 3.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2017.
 */

package im.actor.sdk.view.emoji;

import java.util.HashMap;

public class EmojiData {

    public static final char[] emojiToFE0F = {
            0x2B50, 0x2600, 0x26C5, 0x2601, 0x26A1, 0x2744, 0x26C4, 0x2614, 0x2708, 0x26F5,
            0x2693, 0x26FD, 0x26F2, 0x26FA, 0x26EA, 0x2615, 0x26BD, 0x26BE, 0x26F3, 0x231A,
            0x260E, 0x231B, 0x2709, 0x2702, 0x2712, 0x270F, 0x2648, 0x2649, 0x264A, 0x264B,
            0x264C, 0x264D, 0x264E, 0x264F, 0x2650, 0x2651, 0x2652, 0x2653, 0x2734, 0x3299,
            0x3297, 0x26D4, 0x2B55, 0x2668, 0x2757, 0x203C, 0x2049, 0x303D, 0x26A0, 0x267B,
            0x2747, 0x2733, 0x24C2, 0x267F, 0x25B6, 0x25C0, 0x27A1, 0x2B05, 0x2B06, 0x2B07,
            0x2197, 0x2198, 0x2199, 0x2196, 0x2195, 0x2194, 0x21AA, 0x21A9, 0x2934, 0x2935,
            0x2139, 0x2714, 0x2716, 0x2611, 0x26AA, 0x26AB, 0x25AA, 0x25AB, 0x2B1B, 0x2B1C,
            0x25FC, 0x25FB, 0x25FE, 0x25FD, 0x2660, 0x2663, 0x2665, 0x2666, 0x263A, 0x2639,
            0x270C, 0x261D, 0x2764
    };
    //0xD83CDE2F, 0xD83CDC04, 0xD83CDE1A, 0xD83CDD7F

    public static final char[] dataChars = {
            0x262E, 0x271D, 0x262A, 0x2638, 0x2721, 0x262F, 0x2626, 0x26CE, 0x2648, 0x2649,
            0x264A, 0x264B, 0x264C, 0x264D, 0x264E, 0x264F, 0x2650, 0x2651, 0x2652, 0x2653,
            0x269B, 0x2622, 0x2623, 0x2734, 0x3299, 0x3297, 0x26D4, 0x274C, 0x2B55, 0x2668,
            0x2757, 0x2755, 0x2753, 0x2754, 0x203C, 0x2049, 0x269C, 0x303D, 0x26A0, 0x267B,
            0x2747, 0x2733, 0x274E, 0x2705, 0x27BF, 0x24C2, 0x267F, 0x25B6, 0x23F8, 0x23EF,
            0x23F9, 0x23FA, 0x23ED, 0x23EE, 0x23E9, 0x23EA, 0x25C0, 0x23EB, 0x23EC, 0x27A1,
            0x2B05, 0x2B06, 0x2B07, 0x2197, 0x2198, 0x2199, 0x2196, 0x2195, 0x2194, 0x21AA,
            0x21A9, 0x2934, 0x2935, 0x2139, 0x3030, 0x27B0, 0x2714, 0x2795, 0x2796, 0x2797,
            0x2716, 0x00A9, 0x00AE, 0x2122, 0x2611, 0x26AA, 0x26AB, 0x25AA, 0x25AB, 0x2B1B,
            0x2B1C, 0x25FC, 0x25FB, 0x25FE, 0x25FD, 0x2660, 0x2663, 0x2665, 0x2666, 0x263A,
            0x2639, 0x270A, 0x270C, 0x270B, 0x261D, 0x270D, 0x26D1, 0x2764, 0x2763, 0x2615,
            0x26BD, 0x26BE, 0x26F3, 0x26F7, 0x26F8, 0x26F9, 0x231A, 0x2328, 0x260E, 0x23F1,
            0x23F2, 0x23F0, 0x23F3, 0x231B, 0x2696, 0x2692, 0x26CF, 0x2699, 0x26D3, 0x2694,
            0x2620, 0x26B0, 0x26B1, 0x2697, 0x26F1, 0x2709, 0x2702, 0x2712, 0x270F, 0x2708,
            0x26F5, 0x26F4, 0x2693, 0x26FD, 0x26F2, 0x26F0, 0x26FA, 0x26EA, 0x26E9, 0x2618,
            0x2B50, 0x2728, 0x2604, 0x2600, 0x26C5, 0x2601, 0x26C8, 0x26A1, 0x2744, 0x2603,
            0x26C4, 0x2602, 0x2614
    };

    public static final String[] emojiSecret = {
            "😉","😍","😛","😭","😱","😡","😎","😴","😵","😈","😬","😇","😏","👮","👷","💂","👶","👨","👩","👴","👵","😻","😽","🙀","👺","🙈","🙉","🙊","💀","👽","💩","🔥","💥",
            "💤","👂","👀","👃","👅","👄","👍","👎","👌","👊","✌","✋","👐","👆","👇","👉","👈","🙏","👏","💪","🚶","🏃","💃","👫","👪","👬","👭","💅","🎩","👑","👒","👟","👞",
            "👠","👕","👗","👖","👙","👜","👓","🎀","💄","💛","💙","💜","💚","💍","💎","🐶","🐺","🐱","🐭","🐹","🐰","🐸","🐯","🐨","🐻","🐷","🐮","🐗","🐴","🐑","🐘","🐼","🐧",
            "🐥","🐔","🐍","🐢","🐛","🐝","🐜","🐞","🐌","🐙","🐚","🐟","🐬","🐋","🐐","🐊","🐫","🍀","🌹","🌻","🍁","🌾","🍄","🌵","🌴","🌳","🌞","🌚","🌙","🌎","🌋","⚡","☔","❄",
            "⛄","🌀","🌈","🌊","🎓","🎆","🎃","👻","🎅","🎄","🎁","🎈","🔮","🎥","📷","💿","💻","☎","📡","📺","📻","🔉","🔔","⏳","⏰","⌚","🔒","🔑","🔎","💡","🔦","🔌","🔋","🚿",
            "🚽","🔧","🔨","🚪","🚬","💣","🔫","🔪","💊","💉","💰","💵","💳","✉","📫","📦","📅","📁","✂","📌","📎","✒","✏","📐","📚","🔬","🔭","🎨","🎬","🎤","🎧","🎵","🎹","🎻","🎺",
            "🎸","👾","🎮","🃏","🎲","🎯","🏈","🏀","⚽","⚾","🎾","🎱","🏉","🎳","🏁","🏇","🏆","🏊","🏄","☕","🍼","🍺","🍷","🍴","🍕","🍔","🍟","🍗","🍱","🍚","🍜","🍡","🍳","🍞","🍩",
            "🍦","🎂","🍰","🍪","🍫","🍭","🍯","🍎","🍏","🍊","🍋","🍒","🍇","🍉","🍓","🍑","🍌","🍐","🍍","🍆","🍅","🌽","🏡","🏥","🏦","⛪","🏰","⛺","🏭","🗻","🗽","🎠","🎡","⛲","🎢",
            "🚢","🚤","⚓","🚀","✈","🚁","🚂","🚋","🚎","🚌","🚙","🚗","🚕","🚛","🚨","🚔","🚒","🚑","🚲","🚠","🚜","🚦","⚠","🚧","⛽","🎰","🗿","🎪","🎭","🇯🇵","🇰🇷","🇩🇪","🇨🇳","🇺🇸","🇫🇷","🇪🇸",
            "🇮🇹","🇷🇺","🇬🇧","1⃣","2⃣","3⃣","4⃣","5⃣","6⃣","7⃣","8⃣","9⃣","0⃣","🔟","❗","❓","♥","♦","💯","🔗","🔱","🔴","🔵","🔶","🔷"
    };

    public static final String[] emojiColored = {
            "👐","🙌","👏","🙏","👍","👎","👊","✊","🤛","🤜","🤞","✌","🤘","👌","👈","👉","👆","👇","☝","✋","🤚","🖐","🖖","👋","🤙","💪","🖕","✍","🤳","💅","👂","👃","👶","👦","👧","👨","👩","👱‍♀","👱","👴","👵","👲","👳‍♀","👳","👮‍♀","👮","👷‍♀","👷","💂‍♀","💂","🕵‍♀","🕵","👩‍⚕","👨‍⚕","👩‍🌾","👨‍🌾","👩‍🍳","👨‍🍳","👩‍🎓","👨‍🎓","👩‍🎤","👨‍🎤","👩‍🏫","👨‍🏫","👩‍🏭","👨‍🏭","👩‍💻","👨‍💻","👩‍💼","👨‍💼","👩‍🔧","👨‍🔧","👩‍🔬","👨‍🔬","👩‍🎨","👨‍🎨","👩‍🚒","👨‍🚒","👩‍✈","👨‍✈","👩‍🚀","👨‍🚀","👩‍⚖","👨‍⚖","🤶","🎅","👸","🤴","👰","🤵","👼","🤰","🙇‍♀","🙇","💁","💁‍♂","🙅","🙅‍♂","🙆","🙆‍♂","🙋","🙋‍♂","🤦‍♀","🤦‍♂","🤷‍♀","🤷‍♂","🙎","🙎‍♂","🙍","🙍‍♂","💇","💇‍♂","💆","💆‍♂","🕴","💃","🕺","🚶‍♀","🚶","🏃‍♀","🏃","🏋‍♀","🏋","🤸‍♀","🤸‍♂","⛹‍♀","⛹","🤾‍♀","🤾‍♂","🏌‍♀","🏌","🏄‍♀","🏄","🏊‍♀","🏊","🤽‍♀","🤽‍♂","🏄","🏊‍♀","🏊","🤽‍♀","🤽‍♂","🚣‍♀","🚣","🏇","🚴‍♀","🚴","🚵‍♀","🚵","🤹‍♀","🤹‍♂","🛀"
    };

    public static final String[][] dataColored = {
            new String[]{
                    "😀","😃","😄","😁","😆","😅","😂","🤣","☺","😊","😇","🙂","🙃","😉","😌","😍","😘","😗","😙","😚","😋","😜","😝","😛","🤑","🤗","🤓","😎","🤡","🤠","😏","😒","😞","😔","😟","😕","🙁","☹","😣","😖","😫","😩","😤","😠","😡","😶","😐","😑","😯","😦","😧","😮","😲","😵","😳","😱","😨","😰","😢","😥","🤤","😭","😓","😪","😴","🙄","🤔","🤥","😬","🤐","🤢","🤧","😷","🤒","🤕","😈","👿","👹","👺","💩","👻","💀","☠","👽","👾","🤖","🎃","😺","😸","😹","😻","😼","😽","🙀","😿","😾",
                    "👐",
                    "🙌",
                    "👏",
                    "🙏",
                    "🤝",
                    "👍",
                    "👎",
                    "👊",
                    "✊",
                    "🤛",
                    "🤜",
                    "🤞",
                    "✌",
                    "🤘",
                    "👌",
                    "👈",
                    "👉",
                    "👆",
                    "👇",
                    "☝",
                    "✋",
                    "🤚",
                    "🖐",
                    "🖖",
                    "👋",
                    "🤙",
                    "💪",
                    "🖕",
                    "✍",
                    "🤳",
                    "💅",
                    "💍","💄","💋","👄","👅",
                    "👂",
                    "👃",
                    "👣","👁","👀","🗣","👤","👥",
                    "👶",
                    "👦",
                    "👧",
                    "👨",
                    "👩",
                    "👱‍♀",
                    "👱",
                    "👴",
                    "👵",
                    "👲",
                    "👳‍♀",
                    "👳",
                    "👮‍♀",
                    "👮",
                    "👷‍♀",
                    "👷",
                    "💂‍♀",
                    "💂",
                    "🕵‍♀",
                    "🕵",
                    "👩‍⚕",
                    "👨‍⚕",
                    "👩‍🌾",
                    "👨‍🌾",
                    "👩‍🍳",
                    "👨‍🍳",
                    "👩‍🎓",
                    "👨‍🎓",
                    "👩‍🎤",
                    "👨‍🎤",
                    "👩‍🏫",
                    "👨‍🏫",
                    "👩‍🏭",
                    "👨‍🏭",
                    "👩‍💻",
                    "👨‍💻",
                    "👩‍💼",
                    "👨‍💼",
                    "👩‍🔧",
                    "👨‍🔧",
                    "👩‍🔬",
                    "👨‍🔬",
                    "👩‍🎨",
                    "👨‍🎨",
                    "👩‍🚒",
                    "👨‍🚒",
                    "👩‍✈",
                    "👨‍✈",
                    "👩‍🚀",
                    "👨‍🚀",
                    "👩‍⚖",
                    "👨‍⚖",
                    "🤶",
                    "🎅",
                    "👸",
                    "🤴",
                    "👰",
                    "🤵",
                    "👼",
                    "🤰",
                    "🙇‍♀",
                    "🙇",
                    "💁",
                    "💁‍♂",
                    "🙅",
                    "🙅‍♂",
                    "🙆",
                    "🙆‍♂",
                    "🙋",
                    "🙋‍♂",
                    "🤦‍♀",
                    "🤦‍♂",
                    "🤷‍♀",
                    "🤷‍♂",
                    "🙎",
                    "🙎‍♂",
                    "🙍",
                    "🙍‍♂",
                    "💇",
                    "💇‍♂",
                    "💆",
                    "💆‍♂",
                    "🕴",
                    "💃",
                    "🕺",
                    "👯","👯‍♂",
                    "🚶‍♀",
                    "🚶",
                    "🏃‍♀",
                    "🏃",
                    "👫","👭","👬","💑","👩‍❤‍👩","👨‍❤‍👨","💏","👩‍❤‍💋‍👩","👨‍❤‍💋‍👨","👪","👨‍👩‍👧","👨‍👩‍👧‍👦","👨‍👩‍👦‍👦","👨‍👩‍👧‍👧","👩‍👩‍👦","👩‍👩‍👧","👩‍👩‍👧‍👦","👩‍👩‍👦‍👦","👩‍👩‍👧‍👧","👨‍👨‍👦","👨‍👨‍👧","👨‍👨‍👧‍👦","👨‍👨‍👦‍👦","👨‍👨‍👧‍👧","👩‍👦","👩‍👧","👩‍👧‍👦","👩‍👦‍👦","👩‍👧‍👧","👨‍👦","👨‍👧","👨‍👧‍👦","👨‍👦‍👦","👨‍👧‍👧","👚","👕","👖","👔","👗","👙","👘","👠","👡","👢","👞","👟","👒","🎩","🎓","👑","⛑","🎒","👝","👛","👜","💼","👓","🕶","🌂","☂","❤","💛","💚","💙","💜","🖤","💔","❣","💕","💞","💓","💗","💖","💘","💝"
            },
            null,
            new String[]{
                    "🍏","🍎","🍐","🍊","🍋","🍌","🍉","🍇","🍓","🍈","🍒","🍑","🍍","🥝","🥑","🍅","🍆","🥒","🥕","🌽","🌶","🥔","🍠","🌰","🥜","🍯","🥐","🍞","🥖","🧀","🥚","🍳","🥓","🥞","🍤","🍗","🍖","🍕","🌭","🍔","🍟","🥙","🌮","🌯","🥗","🥘","🍝","🍜","🍲","🍥","🍣","🍱","🍛","🍙","🍚","🍘","🍢","🍡","🍧","🍨","🍦","🍰","🎂","🍮","🍭","🍬","🍫","🍿","🍩","🍪","🥛","🍼","☕","🍵","🍶","🍺","🍻","🥂","🍷","🥃","🍸","🍹","🍾","🥄","🍴","🍽","⚽","🏀","🏈","⚾","🎾","🏐","🏉","🎱","🏓","🏸","🥅","🏒","🏑","🏏","⛳","🏹","🎣","🥊","🥋","⛸","🎿","⛷","🏂",
                    "🏋‍♀",
                    "🏋",
                    "🤺","🤼‍♀","🤼‍♂",
                    "🤸‍♀",
                    "🤸‍♂",
                    "⛹‍♀",
                    "⛹",
                    "🤾‍♀",
                    "🤾‍♂",
                    "🏌‍♀",
                    "🏌",
                    "🏄‍♀",
                    "🏄",
                    "🏊‍♀",
                    "🏊",
                    "🤽‍♀",
                    "🤽‍♂",
                    "🚣‍♀",
                    "🚣",
                    "🏇",
                    "🚴‍♀",
                    "🚴",
                    "🚵‍♀",
                    "🚵",
                    "🎽","🏅","🎖","🥇","🥈","🥉","🏆","🏵","🎗","🎫","🎟","🎪",
                    "🤹‍♀",
                    "🤹‍♂",
                    "🎭","🎨","🎬","🎤","🎧","🎼","🎹","🥁","🎷","🎺","🎸","🎻","🎲","🎯","🎳","🎮","🎰"
            },
            null,
            new String[]{
                    "💟","☮","✝","☪","🕉","☸","✡","🔯","🕎","☯","☦","🛐","⛎","♈","♉","♊","♋","♌","♍","♎","♏","♐","♑","♒","♓","🆔","⚛","🉑","☢","☣","📴","📳","🈶","🈚","🈸","🈺","🈷","✴","🆚","💮","🉐","㊙","㊗","🈴","🈵","🈹","🈲","🅰","🅱","🆎","🆑","🅾","🆘","❌","⭕","🛑","⛔","📛","🚫","💯","💢","♨","🚷","🚯","🚳","🚱","🔞","📵","🚭","❗","❕","❓","❔","‼","⁉","🔅","🔆","〽","⚠","🚸","🔱","⚜","🔰","♻","✅","🈯","💹","❇","✳","❎","🌐","💠","Ⓜ","🌀","💤","🏧","🚾","♿","🅿","🈳","🈂","🛂","🛃","🛄","🛅","🚹","🚺","🚼","🚻","🚮","🎦","📶","🈁","🔣","ℹ","🔤","🔡","🔠","🆖","🆗","🆙","🆒","🆕","🆓","0⃣","1⃣","2⃣","3⃣","4⃣","5⃣","6⃣","7⃣","8⃣","9⃣","🔟","🔢","#⃣","*⃣","▶","⏸","⏯","⏹","⏺","⏭","⏮","⏩","⏪","⏫","⏬","◀","🔼","🔽","➡","⬅","⬆","⬇","↗","↘","↙","↖","↕","↔","↪","↩","⤴","⤵","🔀","🔁","🔂","🔄","🔃","🎵","🎶","➕","➖","➗","✖","💲","💱","™","©","®","〰","➰","➿","🔚","🔙","🔛","🔝","🔜","✔","☑","🔘","⚪","⚫","🔴","🔵","🔺","🔻","🔸","🔹","🔶","🔷","🔳","🔲","▪","▫","◾","◽","◼","◻","⬛","⬜","🔈","🔇","🔉","🔊","🔔","🔕","📣","📢","👁‍🗨","💬","💭","🗯","♠","♣","♥","♦","🃏","🎴","🀄","🕐","🕑","🕒","🕓","🕔","🕕","🕖","🕗","🕘","🕙","🕚","🕛","🕜","🕝","🕞","🕟","🕠","🕡","🕢","🕣","🕤","🕥","🕦","🕧","⌚","📱","📲","💻","⌨","🖥","🖨","🖱","🖲","🕹","🗜","💽","💾","💿","📀","📼","📷","📸","📹","🎥","📽","🎞","📞","☎","📟","📠","📺","📻","🎙","🎚","🎛","⏱","⏲","⏰","🕰","⌛","⏳","📡","🔋","🔌","💡","🔦","🕯","🗑","🛢","💸","💵","💴","💶","💷","💰","💳","💎","⚖","🔧","🔨","⚒","🛠","⛏","🔩","⚙","⛓","🔫","💣","🔪","🗡","⚔","🛡","🚬","⚰","⚱","🏺","🔮","📿","💈","⚗","🔭","🔬","🕳","💊","💉","🌡","🚽","🚰","🚿","🛁",
                    "🛀",
                    "🛎","🔑","🗝","🚪","🛋","🛏","🛌","🖼","🛍","🛒","🎁","🎈","🎏","🎀","🎊","🎉","🎎","🏮","🎐","✉","📩","📨","📧","💌","📥","📤","📦","🏷","📪","📫","📬","📭","📮","📯","📜","📃","📄","📑","📊","📈","📉","🗒","🗓","📆","📅","📇","🗃","🗳","🗄","📋","📁","📂","🗂","🗞","📰","📓","📔","📒","📕","📗","📘","📙","📚","📖","🔖","🔗","📎","🖇","📐","📏","📌","📍","✂","🖊","🖋","✒","🖌","🖍","📝","✏","🔍","🔎","🔏","🔐","🔒","🔓"
            }
    };

    public static final String[][] data = {
            new String[]{
                    "😀","😃","😄","😁","😆","😅","😂","🤣","☺","😊","😇","🙂","🙃","😉","😌","😍","😘","😗","😙","😚","😋","😜","😝","😛","🤑","🤗","🤓","😎","🤡","🤠","😏","😒","😞","😔","😟","😕","🙁","☹","😣","😖","😫","😩","😤","😠","😡","😶","😐","😑","😯","😦","😧","😮","😲","😵","😳","😱","😨","😰","😢","😥","🤤","😭","😓","😪","😴","🙄","🤔","🤥","😬","🤐","🤢","🤧","😷","🤒","🤕","😈","👿","👹","👺","💩","👻","💀","☠","👽","👾","🤖","🎃","😺","😸","😹","😻","😼","😽","🙀","😿","😾","👐","👐🏻","👐🏼","👐🏽","👐🏾","👐🏿","🙌","🙌🏻","🙌🏼","🙌🏽","🙌🏾","🙌🏿","👏","👏🏻","👏🏼","👏🏽","👏🏾","👏🏿","🙏","🙏🏻","🙏🏼","🙏🏽","🙏🏾","🙏🏿","🤝","👍","👍🏻","👍🏼","👍🏽","👍🏾","👍🏿","👎","👎🏻","👎🏼","👎🏽","👎🏾","👎🏿","👊","👊🏻","👊🏼","👊🏽","👊🏾","👊🏿","✊","✊🏻","✊🏼","✊🏽","✊🏾","✊🏿","🤛","🤛🏻","🤛🏼","🤛🏽","🤛🏾","🤛🏿","🤜","🤜🏻","🤜🏼","🤜🏽","🤜🏾","🤜🏿","🤞","🤞🏻","🤞🏼","🤞🏽","🤞🏾","🤞🏿","✌","✌🏻","✌🏼","✌🏽","✌🏾","✌🏿","🤘","🤘🏻","🤘🏼","🤘🏽","🤘🏾","🤘🏿","👌","👌🏻","👌🏼","👌🏽","👌🏾","👌🏿","👈","👈🏻","👈🏼","👈🏽","👈🏾","👈🏿","👉","👉🏻","👉🏼","👉🏽","👉🏾","👉🏿","👆","👆🏻","👆🏼","👆🏽","👆🏾","👆🏿","👇","👇🏻","👇🏼","👇🏽","👇🏾","👇🏿","☝","☝🏻","☝🏼","☝🏽","☝🏾","☝🏿","✋","✋🏻","✋🏼","✋🏽","✋🏾","✋🏿","🤚","🤚🏻","🤚🏼","🤚🏽","🤚🏾","🤚🏿","🖐","🖐🏻","🖐🏼","🖐🏽","🖐🏾","🖐🏿","🖖","🖖🏻","🖖🏼","🖖🏽","🖖🏾","🖖🏿","👋","👋🏻","👋🏼","👋🏽","👋🏾","👋🏿","🤙","🤙🏻","🤙🏼","🤙🏽","🤙🏾","🤙🏿","💪","💪🏻","💪🏼","💪🏽","💪🏾","💪🏿","🖕","🖕🏻","🖕🏼","🖕🏽","🖕🏾","🖕🏿","✍","✍🏻","✍🏼","✍🏽","✍🏾","✍🏿","🤳","🤳🏻","🤳🏼","🤳🏽","🤳🏾","🤳🏿","💅","💅🏻","💅🏼","💅🏽","💅🏾","💅🏿","💍","💄","💋","👄","👅","👂","👂🏻","👂🏼","👂🏽","👂🏾","👂🏿","👃","👃🏻","👃🏼","👃🏽","👃🏾","👃🏿","👣","👁","👀","🗣","👤","👥","👶","👶🏻","👶🏼","👶🏽","👶🏾","👶🏿","👦","👦🏻","👦🏼","👦🏽","👦🏾","👦🏿","👧","👧🏻","👧🏼","👧🏽","👧🏾","👧🏿","👨","👨🏻","👨🏼","👨🏽","👨🏾","👨🏿","👩","👩🏻","👩🏼","👩🏽","👩🏾","👩🏿","👱‍♀","👱🏻‍♀","👱🏼‍♀","👱🏽‍♀","👱🏾‍♀","👱🏿‍♀","👱","👱🏻","👱🏼","👱🏽","👱🏾","👱🏿","👴","👴🏻","👴🏼","👴🏽","👴🏾","👴🏿","👵","👵🏻","👵🏼","👵🏽","👵🏾","👵🏿","👲","👲🏻","👲🏼","👲🏽","👲🏾","👲🏿","👳‍♀","👳🏻‍♀","👳🏼‍♀","👳🏽‍♀","👳🏾‍♀","👳🏿‍♀","👳","👳🏻","👳🏼","👳🏽","👳🏾","👳🏿","👮‍♀","👮🏻‍♀","👮🏼‍♀","👮🏽‍♀","👮🏾‍♀","👮🏿‍♀","👮","👮🏻","👮🏼","👮🏽","👮🏾","👮🏿","👷‍♀","👷🏻‍♀","👷🏼‍♀","👷🏽‍♀","👷🏾‍♀","👷🏿‍♀","👷","👷🏻","👷🏼","👷🏽","👷🏾","👷🏿","💂‍♀","💂🏻‍♀","💂🏼‍♀","💂🏽‍♀","💂🏾‍♀","💂🏿‍♀","💂","💂🏻","💂🏼","💂🏽","💂🏾","💂🏿","🕵‍♀","🕵🏻‍♀","🕵🏼‍♀","🕵🏽‍♀","🕵🏾‍♀","🕵🏿‍♀","🕵","🕵🏻","🕵🏼","🕵🏽","🕵🏾","🕵🏿","👩‍⚕","👩🏻‍⚕","👩🏼‍⚕","👩🏽‍⚕","👩🏾‍⚕","👩🏿‍⚕","👨‍⚕","👨🏻‍⚕","👨🏼‍⚕","👨🏽‍⚕","👨🏾‍⚕","👨🏿‍⚕","👩‍🌾","👩🏻‍🌾","👩🏼‍🌾","👩🏽‍🌾","👩🏾‍🌾","👩🏿‍🌾","👨‍🌾","👨🏻‍🌾","👨🏼‍🌾","👨🏽‍🌾","👨🏾‍🌾","👨🏿‍🌾","👩‍🍳","👩🏻‍🍳","👩🏼‍🍳","👩🏽‍🍳","👩🏾‍🍳","👩🏿‍🍳","👨‍🍳","👨🏻‍🍳","👨🏼‍🍳","👨🏽‍🍳","👨🏾‍🍳","👨🏿‍🍳","👩‍🎓","👩🏻‍🎓","👩🏼‍🎓","👩🏽‍🎓","👩🏾‍🎓","👩🏿‍🎓","👨‍🎓","👨🏻‍🎓","👨🏼‍🎓","👨🏽‍🎓","👨🏾‍🎓","👨🏿‍🎓","👩‍🎤","👩🏻‍🎤","👩🏼‍🎤","👩🏽‍🎤","👩🏾‍🎤","👩🏿‍🎤","👨‍🎤","👨🏻‍🎤","👨🏼‍🎤","👨🏽‍🎤","👨🏾‍🎤","👨🏿‍🎤","👩‍🏫","👩🏻‍🏫","👩🏼‍🏫","👩🏽‍🏫","👩🏾‍🏫","👩🏿‍🏫","👨‍🏫","👨🏻‍🏫","👨🏼‍🏫","👨🏽‍🏫","👨🏾‍🏫","👨🏿‍🏫","👩‍🏭","👩🏻‍🏭","👩🏼‍🏭","👩🏽‍🏭","👩🏾‍🏭","👩🏿‍🏭","👨‍🏭","👨🏻‍🏭","👨🏼‍🏭","👨🏽‍🏭","👨🏾‍🏭","👨🏿‍🏭","👩‍💻","👩🏻‍💻","👩🏼‍💻","👩🏽‍💻","👩🏾‍💻","👩🏿‍💻","👨‍💻","👨🏻‍💻","👨🏼‍💻","👨🏽‍💻","👨🏾‍💻","👨🏿‍💻","👩‍💼","👩🏻‍💼","👩🏼‍💼","👩🏽‍💼","👩🏾‍💼","👩🏿‍💼","👨‍💼","👨🏻‍💼","👨🏼‍💼","👨🏽‍💼","👨🏾‍💼","👨🏿‍💼","👩‍🔧","👩🏻‍🔧","👩🏼‍🔧","👩🏽‍🔧","👩🏾‍🔧","👩🏿‍🔧","👨‍🔧","👨🏻‍🔧","👨🏼‍🔧","👨🏽‍🔧","👨🏾‍🔧","👨🏿‍🔧","👩‍🔬","👩🏻‍🔬","👩🏼‍🔬","👩🏽‍🔬","👩🏾‍🔬","👩🏿‍🔬","👨‍🔬","👨🏻‍🔬","👨🏼‍🔬","👨🏽‍🔬","👨🏾‍🔬","👨🏿‍🔬","👩‍🎨","👩🏻‍🎨","👩🏼‍🎨","👩🏽‍🎨","👩🏾‍🎨","👩🏿‍🎨","👨‍🎨","👨🏻‍🎨","👨🏼‍🎨","👨🏽‍🎨","👨🏾‍🎨","👨🏿‍🎨","👩‍🚒","👩🏻‍🚒","👩🏼‍🚒","👩🏽‍🚒","👩🏾‍🚒","👩🏿‍🚒","👨‍🚒","👨🏻‍🚒","👨🏼‍🚒","👨🏽‍🚒","👨🏾‍🚒","👨🏿‍🚒","👩‍✈","👩🏻‍✈","👩🏼‍✈","👩🏽‍✈","👩🏾‍✈","👩🏿‍✈","👨‍✈","👨🏻‍✈","👨🏼‍✈","👨🏽‍✈","👨🏾‍✈","👨🏿‍✈","👩‍🚀","👩🏻‍🚀","👩🏼‍🚀","👩🏽‍🚀","👩🏾‍🚀","👩🏿‍🚀","👨‍🚀","👨🏻‍🚀","👨🏼‍🚀","👨🏽‍🚀","👨🏾‍🚀","👨🏿‍🚀","👩‍⚖","👩🏻‍⚖","👩🏼‍⚖","👩🏽‍⚖","👩🏾‍⚖","👩🏿‍⚖","👨‍⚖","👨🏻‍⚖","👨🏼‍⚖","👨🏽‍⚖","👨🏾‍⚖","👨🏿‍⚖","🤶","🤶🏻","🤶🏼","🤶🏽","🤶🏾","🤶🏿","🎅","🎅🏻","🎅🏼","🎅🏽","🎅🏾","🎅🏿","👸","👸🏻","👸🏼","👸🏽","👸🏾","👸🏿","🤴","🤴🏻","🤴🏼","🤴🏽","🤴🏾","🤴🏿","👰","👰🏻","👰🏼","👰🏽","👰🏾","👰🏿","🤵","🤵🏻","🤵🏼","🤵🏽","🤵🏾","🤵🏿","👼","👼🏻","👼🏼","👼🏽","👼🏾","👼🏿","🤰","🤰🏻","🤰🏼","🤰🏽","🤰🏾","🤰🏿","🙇‍♀","🙇🏻‍♀","🙇🏼‍♀","🙇🏽‍♀","🙇🏾‍♀","🙇🏿‍♀","🙇","🙇🏻","🙇🏼","🙇🏽","🙇🏾","🙇🏿","💁","💁🏻","💁🏼","💁🏽","💁🏾","💁🏿","💁‍♂","💁🏻‍♂","💁🏼‍♂","💁🏽‍♂","💁🏾‍♂","💁🏿‍♂","🙅","🙅🏻","🙅🏼","🙅🏽","🙅🏾","🙅🏿","🙅‍♂","🙅🏻‍♂","🙅🏼‍♂","🙅🏽‍♂","🙅🏾‍♂","🙅🏿‍♂","🙆","🙆🏻","🙆🏼","🙆🏽","🙆🏾","🙆🏿","🙆‍♂","🙆🏻‍♂","🙆🏼‍♂","🙆🏽‍♂","🙆🏾‍♂","🙆🏿‍♂","🙋","🙋🏻","🙋🏼","🙋🏽","🙋🏾","🙋🏿","🙋‍♂","🙋🏻‍♂","🙋🏼‍♂","🙋🏽‍♂","🙋🏾‍♂","🙋🏿‍♂","🤦‍♀","🤦🏻‍♀","🤦🏼‍♀","🤦🏽‍♀","🤦🏾‍♀","🤦🏿‍♀","🤦‍♂","🤦🏻‍♂","🤦🏼‍♂","🤦🏽‍♂","🤦🏾‍♂","🤦🏿‍♂","🤷‍♀","🤷🏻‍♀","🤷🏼‍♀","🤷🏽‍♀","🤷🏾‍♀","🤷🏿‍♀","🤷‍♂","🤷🏻‍♂","🤷🏼‍♂","🤷🏽‍♂","🤷🏾‍♂","🤷🏿‍♂","🙎","🙎🏻","🙎🏼","🙎🏽","🙎🏾","🙎🏿","🙎‍♂","🙎🏻‍♂","🙎🏼‍♂","🙎🏽‍♂","🙎🏾‍♂","🙎🏿‍♂","🙍","🙍🏻","🙍🏼","🙍🏽","🙍🏾","🙍🏿","🙍‍♂","🙍🏻‍♂","🙍🏼‍♂","🙍🏽‍♂","🙍🏾‍♂","🙍🏿‍♂","💇","💇🏻","💇🏼","💇🏽","💇🏾","💇🏿","💇‍♂","💇🏻‍♂","💇🏼‍♂","💇🏽‍♂","💇🏾‍♂","💇🏿‍♂","💆","💆🏻","💆🏼","💆🏽","💆🏾","💆🏿","💆‍♂","💆🏻‍♂","💆🏼‍♂","💆🏽‍♂","💆🏾‍♂","💆🏿‍♂","🕴","🕴🏻","🕴🏼","🕴🏽","🕴🏾","🕴🏿","💃","💃🏻","💃🏼","💃🏽","💃🏾","💃🏿","🕺","🕺🏻","🕺🏼","🕺🏽","🕺🏾","🕺🏿","👯","👯‍♂","🚶‍♀","🚶🏻‍♀","🚶🏼‍♀","🚶🏽‍♀","🚶🏾‍♀","🚶🏿‍♀","🚶","🚶🏻","🚶🏼","🚶🏽","🚶🏾","🚶🏿","🏃‍♀","🏃🏻‍♀","🏃🏼‍♀","🏃🏽‍♀","🏃🏾‍♀","🏃🏿‍♀","🏃","🏃🏻","🏃🏼","🏃🏽","🏃🏾","🏃🏿","👫","👭","👬","💑","👩‍❤‍👩","👨‍❤‍👨","💏","👩‍❤‍💋‍👩","👨‍❤‍💋‍👨","👪","👨‍👩‍👧","👨‍👩‍👧‍👦","👨‍👩‍👦‍👦","👨‍👩‍👧‍👧","👩‍👩‍👦","👩‍👩‍👧","👩‍👩‍👧‍👦","👩‍👩‍👦‍👦","👩‍👩‍👧‍👧","👨‍👨‍👦","👨‍👨‍👧","👨‍👨‍👧‍👦","👨‍👨‍👦‍👦","👨‍👨‍👧‍👧","👩‍👦","👩‍👧","👩‍👧‍👦","👩‍👦‍👦","👩‍👧‍👧","👨‍👦","👨‍👧","👨‍👧‍👦","👨‍👦‍👦","👨‍👧‍👧","👚","👕","👖","👔","👗","👙","👘","👠","👡","👢","👞","👟","👒","🎩","🎓","👑","⛑","🎒","👝","👛","👜","💼","👓","🕶","🌂","☂","❤","💛","💚","💙","💜","🖤","💔","❣","💕","💞","💓","💗","💖","💘","💝"
            },
            new String[]{
                    "🐶","🐱","🐭","🐹","🐰","🦊","🐻","🐼","🐨","🐯","🦁","🐮","🐷","🐽","🐸","🐵","🙈","🙉","🙊","🐒","🐔","🐧","🐦","🐤","🐣","🐥","🦆","🦅","🦉","🦇","🐺","🐗","🐴","🦄","🐝","🐛","🦋","🐌","🐚","🐞","🐜","🕷","🕸","🐢","🐍","🦎","🦂","🦀","🦑","🐙","🦐","🐠","🐟","🐡","🐬","🦈","🐳","🐋","🐊","🐆","🐅","🐃","🐂","🐄","🦌","🐪","🐫","🐘","🦏","🦍","🐎","🐖","🐐","🐏","🐑","🐕","🐩","🐈","🐓","🦃","🕊","🐇","🐁","🐀","🐿","🐾","🐉","🐲","🌵","🎄","🌲","🌳","🌴","🌱","🌿","☘","🍀","🎍","🎋","🍃","🍂","🍁","🍄","🌾","💐","🌷","🌹","🥀","🌻","🌼","🌸","🌺","🌎","🌍","🌏","🌕","🌖","🌗","🌘","🌑","🌒","🌓","🌔","🌚","🌝","🌞","🌛","🌜","🌙","💫","⭐","🌟","✨","⚡","🔥","💥","☄","☀","🌤","⛅","🌥","🌦","🌈","☁","🌧","⛈","🌩","🌨","☃","⛄","❄","🌬","💨","🌪","🌫","🌊","💧","💦","☔"
            },
            new String[]{
                    "🍏","🍎","🍐","🍊","🍋","🍌","🍉","🍇","🍓","🍈","🍒","🍑","🍍","🥝","🥑","🍅","🍆","🥒","🥕","🌽","🌶","🥔","🍠","🌰","🥜","🍯","🥐","🍞","🥖","🧀","🥚","🍳","🥓","🥞","🍤","🍗","🍖","🍕","🌭","🍔","🍟","🥙","🌮","🌯","🥗","🥘","🍝","🍜","🍲","🍥","🍣","🍱","🍛","🍙","🍚","🍘","🍢","🍡","🍧","🍨","🍦","🍰","🎂","🍮","🍭","🍬","🍫","🍿","🍩","🍪","🥛","🍼","☕","🍵","🍶","🍺","🍻","🥂","🍷","🥃","🍸","🍹","🍾","🥄","🍴","🍽","⚽","🏀","🏈","⚾","🎾","🏐","🏉","🎱","🏓","🏸","🥅","🏒","🏑","🏏","⛳","🏹","🎣","🥊","🥋","⛸","🎿","⛷","🏂","🏋‍♀","🏋🏻‍♀","🏋🏼‍♀","🏋🏽‍♀","🏋🏾‍♀","🏋🏿‍♀","🏋","🏋🏻","🏋🏼","🏋🏽","🏋🏾","🏋🏿","🤺","🤼‍♀","🤼‍♂","🤸‍♀","🤸🏻‍♀","🤸🏼‍♀","🤸🏽‍♀","🤸🏾‍♀","🤸🏿‍♀","🤸‍♂","🤸🏻‍♂","🤸🏼‍♂","🤸🏽‍♂","🤸🏾‍♂","🤸🏿‍♂","⛹‍♀","⛹🏻‍♀","⛹🏼‍♀","⛹🏽‍♀","⛹🏾‍♀","⛹🏿‍♀","⛹","⛹🏻","⛹🏼","⛹🏽","⛹🏾","⛹🏿","🤾‍♀","🤾🏻‍♀","🤾🏼‍♀","🤾🏽‍♀","🤾🏾‍♀","🤾🏿‍♀","🤾‍♂","🤾🏻‍♂","🤾🏼‍♂","🤾🏽‍♂","🤾🏾‍♂","🤾🏿‍♂","🏌‍♀","🏌🏻‍♀","🏌🏼‍♀","🏌🏽‍♀","🏌🏾‍♀","🏌🏿‍♀","🏌","🏌🏻","🏌🏼","🏌🏽","🏌🏾","🏌🏿","🏄‍♀","🏄🏻‍♀","🏄🏼‍♀","🏄🏽‍♀","🏄🏾‍♀","🏄🏿‍♀","🏄","🏄🏻","🏄🏼","🏄🏽","🏄🏾","🏄🏿","🏊‍♀","🏊🏻‍♀","🏊🏼‍♀","🏊🏽‍♀","🏊🏾‍♀","🏊🏿‍♀","🏊","🏊🏻","🏊🏼","🏊🏽","🏊🏾","🏊🏿","🤽‍♀","🤽🏻‍♀","🤽🏼‍♀","🤽🏽‍♀","🤽🏾‍♀","🤽🏿‍♀","🤽‍♂","🤽🏻‍♂","🤽🏼‍♂","🤽🏽‍♂","🤽🏾‍♂","🤽🏿‍♂","🚣‍♀","🚣🏻‍♀","🚣🏼‍♀","🚣🏽‍♀","🚣🏾‍♀","🚣🏿‍♀","🚣","🚣🏻","🚣🏼","🚣🏽","🚣🏾","🚣🏿","🏇","🏇🏻","🏇🏼","🏇🏽","🏇🏾","🏇🏿","🚴‍♀","🚴🏻‍♀","🚴🏼‍♀","🚴🏽‍♀","🚴🏾‍♀","🚴🏿‍♀","🚴","🚴🏻","🚴🏼","🚴🏽","🚴🏾","🚴🏿","🚵‍♀","🚵🏻‍♀","🚵🏼‍♀","🚵🏽‍♀","🚵🏾‍♀","🚵🏿‍♀","🚵","🚵🏻","🚵🏼","🚵🏽","🚵🏾","🚵🏿","🎽","🏅","🎖","🥇","🥈","🥉","🏆","🏵","🎗","🎫","🎟","🎪","🤹‍♀","🤹🏻‍♀","🤹🏼‍♀","🤹🏽‍♀","🤹🏾‍♀","🤹🏿‍♀","🤹‍♂","🤹🏻‍♂","🤹🏼‍♂","🤹🏽‍♂","🤹🏾‍♂","🤹🏿‍♂","🎭","🎨","🎬","🎤","🎧","🎼","🎹","🥁","🎷","🎺","🎸","🎻","🎲","🎯","🎳","🎮","🎰"
            },
            new String[]{
                    "🚗","🚕","🚙","🚌","🚎","🏎","🚓","🚑","🚒","🚐","🚚","🚛","🚜","🛴","🚲","🛵","🏍","🚨","🚔","🚍","🚘","🚖","🚡","🚠","🚟","🚃","🚋","🚞","🚝","🚄","🚅","🚈","🚂","🚆","🚇","🚊","🚉","🚁","🛩","✈","🛫","🛬","🚀","🛰","💺","🛶","⛵","🛥","🚤","🛳","⛴","🚢","⚓","🚧","⛽","🚏","🚦","🚥","🗺","🗿","🗽","⛲","🗼","🏰","🏯","🏟","🎡","🎢","🎠","⛱","🏖","🏝","⛰","🏔","🗻","🌋","🏜","🏕","⛺","🛤","🛣","🏗","🏭","🏠","🏡","🏘","🏚","🏢","🏬","🏣","🏤","🏥","🏦","🏨","🏪","🏫","🏩","💒","🏛","⛪","🕌","🕍","🕋","⛩","🗾","🎑","🏞","🌅","🌄","🌠","🎇","🎆","🌇","🌆","🏙","🌃","🌌","🌉","🌁","🏳","🏴","🏁","🚩","🏳‍🌈","🇦🇺","🇦🇹","🇦🇿","🇦🇽","🇦🇱","🇩🇿","🇦🇸","🇦🇮","🇦🇴","🇦🇩","🇦🇶","🇦🇬","🇦🇷","🇦🇲","🇦🇼","🇦🇫","🇧🇸","🇧🇩","🇧🇧","🇧🇭","🇧🇾","🇧🇿","🇧🇪","🇧🇯","🇧🇲","🇧🇬","🇧🇴","🇧🇶","🇧🇦","🇧🇼","🇧🇷","🇮🇴","🇧🇳","🇧🇫","🇧🇮","🇧🇹","🇻🇺","🇻🇦","🇬🇧","🇭🇺","🇻🇪","🇻🇬","🇻🇮","🇹🇱","🇻🇳","🇬🇦","🇭🇹","🇬🇾","🇬🇲","🇬🇭","🇬🇵","🇬🇹","🇬🇳","🇬🇼","🇩🇪","🇬🇬","🇬🇮","🇭🇳","🇭🇰","🇬🇩","🇬🇱","🇬🇷","🇬🇪","🇬🇺","🇩🇰","🇯🇪","🇩🇯","🇩🇲","🇩🇴","🇪🇺","🇪🇬","🇿🇲","🇪🇭","🇿🇼","🇮🇱","🇮🇳","🇮🇩","🇯🇴","🇮🇶","🇮🇷","🇮🇪","🇮🇸","🇪🇸","🇮🇹","🇾🇪","🇨🇻","🇰🇿","🇰🇾","🇰🇭","🇨🇲","🇨🇦","🇮🇨","🇶🇦","🇰🇪","🇨🇾","🇰🇬","🇰🇮","🇨🇳","🇰🇵","🇨🇨","🇨🇴","🇰🇲","🇨🇬","🇨🇩","🇽🇰","🇨🇷","🇨🇮","🇨🇺","🇰🇼","🇨🇼","🇱🇦","🇱🇻","🇱🇸","🇱🇷","🇱🇧","🇱🇾","🇱🇹","🇱🇮","🇱🇺","🇲🇺","🇲🇷","🇲🇬","🇾🇹","🇲🇴","🇲🇰","🇲🇼","🇲🇾","🇲🇱","🇲🇻","🇲🇹","🇲🇦","🇲🇶","🇲🇭","🇲🇽","🇫🇲","🇲🇿","🇲🇩","🇲🇨","🇲🇳","🇲🇸","🇲🇲","🇳🇦","🇳🇷","🇳🇵","🇳🇪","🇳🇬","🇳🇱","🇳🇮","🇳🇺","🇳🇿","🇳🇨","🇳🇴","🇮🇲","🇳🇫","🇨🇽","🇸🇭","🇨🇰","🇹🇨","🇦🇪","🇴🇲","🇵🇳","🇵🇰","🇵🇼","🇵🇸","🇵🇦","🇵🇬","🇵🇾","🇵🇪","🇵🇱","🇵🇹","🇵🇷","🇰🇷","🇷🇪","🇷🇺","🇷🇼","🇷🇴","🇸🇻","🇼🇸","🇸🇲","🇸🇹","🇸🇦","🇸🇿","🇲🇵","🇸🇨","🇧🇱","🇵🇲","🇸🇳","🇻🇨","🇰🇳","🇱🇨","🇷🇸","🇸🇬","🇸🇽","🇸🇾","🇸🇰","🇸🇮","🇺🇸","🇸🇧","🇸🇴","🇸🇩","🇸🇷","🇸🇱","🇹🇯","🇹🇭","🇹🇼","🇹🇿","🇹🇬","🇹🇰","🇹🇴","🇹🇹","🇹🇻","🇹🇳","🇹🇲","🇹🇷","🇺🇬","🇺🇿","🇺🇦","🇼🇫","🇺🇾","🇫🇴","🇫🇯","🇵🇭","🇫🇮","🇫🇰","🇫🇷","🇬🇫","🇵🇫","🇹🇫","🇭🇷","🇨🇫","🇹🇩","🇲🇪","🇨🇿","🇨🇱","🇨🇭","🇸🇪","🇱🇰","🇪🇨","🇬🇶","🇪🇷","🇪🇪","🇪🇹","🇿🇦","🇬🇸","🇸🇸","🇯🇲","🇯🇵","🎌"
            },
            new String[]{
                    "💟","☮","✝","☪","🕉","☸","✡","🔯","🕎","☯","☦","🛐","⛎","♈","♉","♊","♋","♌","♍","♎","♏","♐","♑","♒","♓","🆔","⚛","🉑","☢","☣","📴","📳","🈶","🈚","🈸","🈺","🈷","✴","🆚","💮","🉐","㊙","㊗","🈴","🈵","🈹","🈲","🅰","🅱","🆎","🆑","🅾","🆘","❌","⭕","🛑","⛔","📛","🚫","💯","💢","♨","🚷","🚯","🚳","🚱","🔞","📵","🚭","❗","❕","❓","❔","‼","⁉","🔅","🔆","〽","⚠","🚸","🔱","⚜","🔰","♻","✅","🈯","💹","❇","✳","❎","🌐","💠","Ⓜ","🌀","💤","🏧","🚾","♿","🅿","🈳","🈂","🛂","🛃","🛄","🛅","🚹","🚺","🚼","🚻","🚮","🎦","📶","🈁","🔣","ℹ","🔤","🔡","🔠","🆖","🆗","🆙","🆒","🆕","🆓","0⃣","1⃣","2⃣","3⃣","4⃣","5⃣","6⃣","7⃣","8⃣","9⃣","🔟","🔢","#⃣","*⃣","▶","⏸","⏯","⏹","⏺","⏭","⏮","⏩","⏪","⏫","⏬","◀","🔼","🔽","➡","⬅","⬆","⬇","↗","↘","↙","↖","↕","↔","↪","↩","⤴","⤵","🔀","🔁","🔂","🔄","🔃","🎵","🎶","➕","➖","➗","✖","💲","💱","™","©","®","〰","➰","➿","🔚","🔙","🔛","🔝","🔜","✔","☑","🔘","⚪","⚫","🔴","🔵","🔺","🔻","🔸","🔹","🔶","🔷","🔳","🔲","▪","▫","◾","◽","◼","◻","⬛","⬜","🔈","🔇","🔉","🔊","🔔","🔕","📣","📢","👁‍🗨","💬","💭","🗯","♠","♣","♥","♦","🃏","🎴","🀄","🕐","🕑","🕒","🕓","🕔","🕕","🕖","🕗","🕘","🕙","🕚","🕛","🕜","🕝","🕞","🕟","🕠","🕡","🕢","🕣","🕤","🕥","🕦","🕧","⌚","📱","📲","💻","⌨","🖥","🖨","🖱","🖲","🕹","🗜","💽","💾","💿","📀","📼","📷","📸","📹","🎥","📽","🎞","📞","☎","📟","📠","📺","📻","🎙","🎚","🎛","⏱","⏲","⏰","🕰","⌛","⏳","📡","🔋","🔌","💡","🔦","🕯","🗑","🛢","💸","💵","💴","💶","💷","💰","💳","💎","⚖","🔧","🔨","⚒","🛠","⛏","🔩","⚙","⛓","🔫","💣","🔪","🗡","⚔","🛡","🚬","⚰","⚱","🏺","🔮","📿","💈","⚗","🔭","🔬","🕳","💊","💉","🌡","🚽","🚰","🚿","🛁","🛀","🛀🏻","🛀🏼","🛀🏽","🛀🏾","🛀🏿","🛎","🔑","🗝","🚪","🛋","🛏","🛌","🖼","🛍","🛒","🎁","🎈","🎏","🎀","🎊","🎉","🎎","🏮","🎐","✉","📩","📨","📧","💌","📥","📤","📦","🏷","📪","📫","📬","📭","📮","📯","📜","📃","📄","📑","📊","📈","📉","🗒","🗓","📆","📅","📇","🗃","🗳","🗄","📋","📁","📂","🗂","🗞","📰","📓","📔","📒","📕","📗","📘","📙","📚","📖","🔖","🔗","📎","🖇","📐","📏","📌","📍","✂","🖊","🖋","✒","🖌","🖍","📝","✏","🔍","🔎","🔏","🔐","🔒","🔓"
            }
    };

    public static final HashMap<Character, Boolean> emojiToFE0FMap = new HashMap<>(emojiToFE0F.length);
    public static final HashMap<Character, Boolean> dataCharsMap = new HashMap<>(dataChars.length);
    public static final HashMap<String, Boolean> emojiColoredMap = new HashMap<>(emojiColored.length);

    static {
        for (int a = 0; a < emojiToFE0F.length; a++) {
            emojiToFE0FMap.put(emojiToFE0F[a], true);
        }
        for (int a = 0; a < dataChars.length; a++) {
            dataCharsMap.put(dataChars[a], true);
        }
        for (int a = 0; a < emojiColored.length; a++) {
            emojiColoredMap.put(emojiColored[a], true);
        }
        dataColored[1] = data[1];
        dataColored[3] = data[3];
    }
}
