SUMMARY = "Qt GUI implementation of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.6.1"

RPM_NAME = "libaudqt4-4.6.1-1.3.aarch64.rpm"
RPM_HASH = "3231cd03be3d5016616b37a7b42d4965baf68d84d352b0c6e55a08e73a0f7d835dd4ae2ac9fe065f24edc0548b96df0ceb963cc01f53cc667ebec4e49e712cae"

RPROVIDES:${PN} += "libaudqt.so.4 \
libaudqt4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libaudcore.so.6 \
libaudcore6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
