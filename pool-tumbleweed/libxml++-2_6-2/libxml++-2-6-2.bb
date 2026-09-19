SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.3"

RPM_NAME = "libxml++-2_6-2-2.42.3-2.6.aarch64.rpm"
RPM_HASH = "72b3303c14568c482cce1ba7664924fc98c0d968a9e33e050a957dd9567a38b70e485220c6003936ff3c4c44a3652e0e1074173ba6235576aaea448f313eefa9"

RPROVIDES:${PN} += "libxml++-2-6-2 \
libxml++-2.6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
