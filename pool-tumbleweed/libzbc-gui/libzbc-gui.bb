SUMMARY = "Graphical frontend for ZBC tools"
DESCRIPTION = "A simple graphical interface showing zone information of a zoned device. \
It also displays the write status (write pointer position) of zones \
graphically using color coding (red for written space and green for \
unwritten space)."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "libzbc-gui-6.2.0-1.9.aarch64.rpm"
RPM_HASH = "21625bc7f0213ac544955a5b4f1f000bf4189f488ae49c69fa9028ca1f8bbf47131c13c26c806758b4d06e3a6ef5cc01b3d18231d81be80e03f0a2f0e344e365"

RPROVIDES:${PN} += "libzbc-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libzbc.so.6"

inherit rpm
