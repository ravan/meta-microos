SUMMARY = "Various text handling addons"
DESCRIPTION = "KTextAddons provides libraries to work with texts, such as grammar checks, \
text to speech and translations."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "ktextaddons-2.1.2-1.1.aarch64.rpm"
RPM_HASH = "509936816ff121a99906ff7262b898874d3071a193e891540958ec08503b65aa511d5270e3f8ebb192ae2486e611762e8203de0ed1727b0cc44fcc9952fbf5bf"

RPROVIDES:${PN} += "ktextaddons \
libmcpprotocolclientplugin.so.0 \
libmcpprotocolserverplugin.so.0 \
libtextautogenerategenericnetwork.so.1 \
libtextautogeneratellamacpp.so.1 \
libtextautogeneratelmstudio.so.1 \
libtextautogenerateollama.so.1 \
libtextautogenerateollamacloud.so.1 \
libtextautogenerateollamacommon.so.1 \
libtextautogenerateollamaonline.so.1 \
libtextautogenerateplugincommon.so.1 \
libtextutils-cmark-rc-copy.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6TextAutoGenerateText.so.1 \
libKF6TextAutoGenerateTextMcpProtocolCore.so.1 \
libKF6TextSpeechToText.so.1 \
libKF6TextTranslator.so.1 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqt6keychain.so.1 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
