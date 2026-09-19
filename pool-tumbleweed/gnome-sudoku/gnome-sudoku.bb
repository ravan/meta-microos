SUMMARY = "Sudoku Game for GNOME"
DESCRIPTION = "Sudoku is a logic puzzle game, in which one must fill a 9 by 9 square \
with the correct digits."
LICENSE = "GPL-3.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-sudoku-50.4-1.1.aarch64.rpm"
RPM_HASH = "5716ba8a8e817c04aae01175bf71ba1d82009e4ddc2c0b09f3c1dadb1eafec60692e85c188a9e8c3c9cf65e7ef1f278e2e5e21176b83e0030be91d6efa515a79"

RPROVIDES:${PN} += "gnome-sudoku"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libqqwing.so.2 \
libstdc++.so.6"

inherit rpm
