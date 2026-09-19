SUMMARY = "Qt5 Speech examples"
DESCRIPTION = "Examples for the libqt5-qtspeech module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde1"

RPM_NAME = "libqt5-qtspeech-examples-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "b9ff24d308b64d4206639bb736bbbce982c264547a6dff73743139bf47d99a65db94754c1616d4ec80eddfd9532988152e1d47c3d83893138eda2e7ddf28fab5"

RPROVIDES:${PN} += "libqt5-qtspeech-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
