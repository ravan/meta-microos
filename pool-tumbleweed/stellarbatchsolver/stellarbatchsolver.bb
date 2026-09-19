SUMMARY = "Batch images solver based on stellarsolver"
DESCRIPTION = "Tool that one could use to automatically solve, extract, and export a large number of images. \
This program is primarily meant for data reduction, but could also be used as a test for the library."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "stellarbatchsolver-2.8-1.3.aarch64.rpm"
RPM_HASH = "55eb8fd66f2f7bc824cfb731c93ea71f376b907c68c54f0b9b44f2f1966ec42afeb209d656545219ebdefd3e8d9ac8db786083a268bca0dc2d4dc2982bd59609"

RPROVIDES:${PN} += "stellarbatchsolver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libstellarsolver6.so.2"

inherit rpm
