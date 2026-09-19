SUMMARY = "Fast, portable and lightweight Morse code signals generator - GUI version"
DESCRIPTION = "CWStudio is lightweight, portable, almost library-independent and computationally \
efficient generator of CW signals for telegraphy training purposes. It can create \
sound with maximum similarity to real air, simulating many difficulties. \
 \
This package contains the wxWidgets based GUI version."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.7"

RPM_NAME = "cwstudio-gui-0.9.7-2.5.aarch64.rpm"
RPM_HASH = "0b0b3538990e122e47309c80b9eb4f3c01c642a09228ddde6b5d6ef9ec3772c56ac2cd705aff5eec80e5ca7a530f32a1810506fd2100abec5efa15b539ce7c01"

RPROVIDES:${PN} += "cwstudio-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpulse-simple.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
