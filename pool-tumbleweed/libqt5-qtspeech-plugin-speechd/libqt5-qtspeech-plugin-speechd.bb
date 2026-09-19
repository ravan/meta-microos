SUMMARY = "Qt5 Speech Module - Speech Dispatcher support"
DESCRIPTION = "This plugin adds support for using speech-dispatcher for speech synthesis \
with the Qt5 Speech module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde1"

RPM_NAME = "libqt5-qtspeech-plugin-speechd-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "f0c72df232bba6aee31b2a15c2acb8ce268f293c82d794a3f20e25e6c2b285a568d23398f21318d7d5f076befc013d367e3e4f7e7d22d742075b7cf6dad251b3"

RPROVIDES:${PN} += "libqt5-qtspeech-plugin-speechd \
libqtexttospeech-speechd.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5TextToSpeech.so.5 \
libQt5TextToSpeech5 \
libc.so.6 \
libspeechd.so.2 \
libstdc++.so.6"

inherit rpm
