SUMMARY = "Utility for writing disk images to USB keys"
DESCRIPTION = "A graphical utility for writing raw disk images & hybrid ISOs to USB keys."
LICENSE = "GPL-2.0-only"

PV = "1.10.1432200249.1d253d9"

RPM_NAME = "imagewriter-1.10.1432200249.1d253d9-2.24.aarch64.rpm"
RPM_HASH = "fd07b6d4f117974dcf7076eee746eac5bd77e5f9651d80bb6c715f8d6c9dfedccfa0ec4a2be207c95acbfea41b79af2915e0cad3290c95f920ab6229631af71b"

RPROVIDES:${PN} += "imagewriter"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
xdg-utils"

inherit rpm
