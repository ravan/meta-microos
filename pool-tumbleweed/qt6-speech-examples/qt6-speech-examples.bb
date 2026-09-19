SUMMARY = "Examples for the qt6-speech modules"
DESCRIPTION = "Examples for the qt6-speech modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-speech-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "fc5876ce1c9da1941c292d5cfd99ccf032e85e0124f5b94beb18c3416b2afb58d3da50989ede5e83ec052d7104587d244e3d18cefb6a4b5aa02800e58b1ae634"

RPROVIDES:${PN} += "qt6-speech-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
