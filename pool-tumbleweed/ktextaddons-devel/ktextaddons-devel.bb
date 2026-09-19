SUMMARY = "Development files for ktextaddons, a library for handling texts"
DESCRIPTION = "This package provides development files to use ktextaddons in other applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "ktextaddons-devel-2.1.2-1.1.aarch64.rpm"
RPM_HASH = "6ffd3e568a1185bd88b4401b08de875b9e1ff9d38f3611094591087e5f0d057387c17a911daa990d334d03ba35570f845fab1a6df5c7e5106aedca4e07068b16"

RPROVIDES:${PN} += "cmake-KF6TextAddonsWidgets \
cmake-KF6TextAutoCorrectionCore \
cmake-KF6TextAutoCorrectionWidgets \
cmake-KF6TextAutoGenerateText \
cmake-KF6TextAutoGenerateTextMcpProtocolCore \
cmake-KF6TextAutoGenerateTextMcpProtocolWidgets \
cmake-KF6TextCustomEditor \
cmake-KF6TextEditTextToSpeech \
cmake-KF6TextEmoticonsCore \
cmake-KF6TextEmoticonsWidgets \
cmake-KF6TextGrammarCheck \
cmake-KF6TextSpeechToText \
cmake-KF6TextTranslator \
cmake-KF6TextUtils \
ktextaddons-devel"

RDEPENDS:${PN} += "cmake-KF6ColorScheme \
cmake-KF6Config \
cmake-KF6CoreAddons \
cmake-KF6I18n \
cmake-KF6Service \
cmake-KF6Sonnet \
cmake-KF6SyntaxHighlighting \
cmake-KF6WidgetsAddons \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6Sql \
cmake-Qt6TextToSpeech \
cmake-Qt6Widgets \
ld-linux-aarch64.so.1 \
libKF6TextAddons1 \
libKF6TextCustomEditor.so.1 \
libKF6TextTranslator.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
