SUMMARY = "Mixed-level, Mixed-signal Circuit Simulator Based on spice3f5"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice."
LICENSE = "BSD-2-Clause"

PV = "46"

RPM_NAME = "ngspice-46-1.2.aarch64.rpm"
RPM_HASH = "152132c71c1304a20941688ffd65172e908e9e054f02e95f0ce9503df8e56896b2ebff83d7512ba6282d9d5e665c759595b898f2329c7612ea27c383504c2894"

RPROVIDES:${PN} += "ngspice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXft.so.2 \
libXt.so.6 \
libc.so.6 \
libfftw3.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtinfo.so.6 \
ngspice-scripts \
ngspice-xspice-cm"

inherit rpm
