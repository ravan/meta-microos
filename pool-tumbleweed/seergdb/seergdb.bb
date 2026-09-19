SUMMARY = "A GUI front-end for GNU gdb"
DESCRIPTION = "A GUI front-end for GNU gdb written in modern C++."
LICENSE = "GPL-3.0-or-later"

PV = "2.7"

RPM_NAME = "seergdb-2.7-1.2.aarch64.rpm"
RPM_HASH = "8fe2069b641ee72691fa92df093c78b796a818998dfa00b509f47be81dbe2639f3f703acc025a260b82c9942bd1933b61a3cde4131fe539cdf187320fa4bc90b"

RPROVIDES:${PN} += "seergdb"

RDEPENDS:${PN} += "gdb \
ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
