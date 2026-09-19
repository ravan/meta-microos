SUMMARY = "Qt 6 TextToSpeech plugin"
DESCRIPTION = "Qt 6 TextToSpeech plugin."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-texttospeech-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "465daf07bce1a53201d1e8127ca9ffba11a58abaa4d784b80a77239049fabf414d0ff535c12ae5321f10c3e829f77d8dc7d2e049e22427437344ba1575088a5d"

RPROVIDES:${PN} += "libqtexttospeech-flite.so \
libqtexttospeech-mock.so \
libqtexttospeech-speechd.so \
libtexttospeechqmlplugin.so \
qt6-texttospeech \
qt6qmlimport-QtTextToSpeech \
qt6qmlimport-QtTextToSpeech.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6TextToSpeech.so.6 \
libc.so.6 \
libflite.so.1 \
libm.so.6 \
libspeechd.so.2 \
libstdc++.so.6"

inherit rpm
