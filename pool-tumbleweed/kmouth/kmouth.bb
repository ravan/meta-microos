SUMMARY = "Speech Synthesizer Frontend"
DESCRIPTION = "The computer 'speaks' the entered text for talking with people."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kmouth-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a555983069986242176316c9f0dd09d4a2a623b7ef07643debbc3ea5e06dff05e12b7b8fe8a5e56ea45430bc40a4c0644e9e5d0f07ef195f36db1efe1676dd92"

RPROVIDES:${PN} += "config-kmouth \
kde4-kmouth \
kmouth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6 \
python3-speechd"

inherit rpm
