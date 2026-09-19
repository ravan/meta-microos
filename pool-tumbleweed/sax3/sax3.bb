SUMMARY = "A Graphical Configuration Tool for X"
DESCRIPTION = "A graphical utility for configuring X server settings. It can run without X with a graphical interface. \
 \
Authors: \
_______ \
Manu Gupta \
Michal Hrusecky"
LICENSE = "GPL-3.0-only"

PV = "0.1.2"

RPM_NAME = "sax3-0.1.2-10.5.aarch64.rpm"
RPM_HASH = "4b72d4793577ff47b3affaf0095a9c0a2b610d6bc2f33f84649db865bd481ded73a48f3edde31ca497a88b020e46f8544db33838dc26a3f2a0e1ae540b53ccfb"

RPROVIDES:${PN} += "libsax3-yuif.so \
sax3"

RDEPENDS:${PN} += "augeas \
augeas-lenses \
ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyui.so.16"

inherit rpm
