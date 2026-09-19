SUMMARY = "Graphical small-internet client"
DESCRIPTION = "Graphical small-internet client supporting gemini, http, https, gopher, finger."
LICENSE = "GPL-3.0-or-later"

PV = "0.4"

RPM_NAME = "kristall-0.4-1.11.aarch64.rpm"
RPM_HASH = "c8e69d9502f8145c65f473e316bab2d434a4f4657b28a46267fa63168a97c4a7d4809b65139797f9ab6d5d2aa8db310ca436ceedadcaf1fcadf44299de1df0f8"

RPROVIDES:${PN} += "kristall"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
