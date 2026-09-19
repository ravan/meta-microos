SUMMARY = "Neuroimaging plugin for Orthanc"
DESCRIPTION = "Plugin to import data from The Cancer Image Archive"
LICENSE = "GPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "orthanc-neuro-1.1-2.10.aarch64.rpm"
RPM_HASH = "abb698e7721e489f40caed1484d51289196864eba8d4308d7f2315dd9fa7ba8d19417dd522ae0fe350a5255ab29b0ea1745448a6e70ec322935fb6c1b4ed0c53"

RPROVIDES:${PN} += "libOrthancNeuro.so.1.1 \
orthanc-neuro"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
orthanc"

inherit rpm
