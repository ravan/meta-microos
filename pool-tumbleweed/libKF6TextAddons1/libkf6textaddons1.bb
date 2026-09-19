SUMMARY = "Text addons libraries"
DESCRIPTION = "KTextAddons provides libraries to work with texts, such as grammar checks, \
text to speech and translations."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "libKF6TextAddons1-2.1.2-1.1.aarch64.rpm"
RPM_HASH = "2c658dcb3e024b18f4faae6cd3e429dc4504da09a9ce21928e2f05ad9c46d7dd21ad582e807f73182b1a93ed5cd5e2e78502c5f5ccaa0c14ab99ea713a734257"

RPROVIDES:${PN} += "libKF6TextAddons1 \
libKF6TextAddonsWidgets.so.1 \
libKF6TextAutoCorrectionCore.so.1 \
libKF6TextAutoCorrectionWidgets.so.1 \
libKF6TextAutoGenerateText.so.1 \
libKF6TextAutoGenerateTextMcpProtocolCore.so.1 \
libKF6TextAutoGenerateTextMcpProtocolWidgets.so.1 \
libKF6TextCustomEditor.so.1 \
libKF6TextEditTextToSpeech.so.1 \
libKF6TextEmoticonsCore.so.1 \
libKF6TextEmoticonsWidgets.so.1 \
libKF6TextGrammarCheck.so.1 \
libKF6TextSpeechToText.so.1 \
libKF6TextTranslator.so.1 \
libKF6TextUtils.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6 \
libtextutils-cmark-rc-copy.so.0"

inherit rpm
