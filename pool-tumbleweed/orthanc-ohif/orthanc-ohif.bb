SUMMARY = "OHIF plugin for Orthanc"
DESCRIPTION = "OHIF plugin for Orthanc \
The homepage of OHIF can be found at: \
https://ohif.org/"
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "orthanc-ohif-1.8-1.1.aarch64.rpm"
RPM_HASH = "121b2562726ad755383aea6f4b736d97454517e79c39e697252376efa496bf1673d4bf1a02195107eddda3f9fc86f33cff221e696b46595ea8f29729d39fb10e"

RPROVIDES:${PN} += "libOrthancOHIF.so.1.8 \
orthanc-ohif"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libstdc++.so.6 \
libz.so.1 \
orthanc"

inherit rpm
