SUMMARY = "Connect Four Game for GNOME"
DESCRIPTION = "The object of Four-in-a-Row is to place four pieces in a vertical, \
horizontal, or diagonal row while the opponent tries to block and make \
his/her own row of four. Four-in-a-Row can be played against another \
human or the computer."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "3.38.1+62"

RPM_NAME = "four-in-a-row-3.38.1+62-1.2.aarch64.rpm"
RPM_HASH = "f4ac149e84883e6c0bb96d96452235625313dafe99d847f6f347c88e8a01709abfdef90cf50a4e35bc9758d9464fb335b0c4bbeced0c991719e47da834cfd57a"

RPROVIDES:${PN} += "four-in-a-row"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-3.so.0"

inherit rpm
