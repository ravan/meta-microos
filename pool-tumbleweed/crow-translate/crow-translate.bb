SUMMARY = "A Qt GUI for Google, Yandex and Bing translators"
DESCRIPTION = "A simple and lightweight translator that allows to translate and speak \
text using Google, Yandex and Bing written with Qt5."
LICENSE = "GPL-3.0-only"

PV = "3.1.0"

RPM_NAME = "crow-translate-3.1.0-2.5.aarch64.rpm"
RPM_HASH = "de354892f2919164fc46cbcc95107882c6a21c99e495a5256036cad57ac2de9655943cf0b538c06a1a12fda1421baa0f941100344bac0a93bdd1c5388846a7db"

RPROVIDES:${PN} += "crow-translate"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libKF5WaylandClient.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtesseract.so.5 \
libxcb.so.1"

inherit rpm
