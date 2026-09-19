SUMMARY = "TCIA plugin for Orthanc"
DESCRIPTION = "Plugin to import data from The Cancer Image Archive"
LICENSE = "GPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "orthanc-tcia-1.3-1.7.aarch64.rpm"
RPM_HASH = "09a906002fbbe198eaac317ce2cd2c9ac3eba6f6c2f249e599291d84b932769a3ee079bef894ad37abf14304d7a4f5b66a3a25710f5fa0ece6a885639cd0509f"

RPROVIDES:${PN} += "libOrthancTcia.so.1.3 \
orthanc-tcia"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcsv.so.3 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libstdc++.so.6 \
orthanc"

inherit rpm
