SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.5"

RPM_NAME = "libxml++-3_0-1-3.2.5-2.6.aarch64.rpm"
RPM_HASH = "5fa3252cc5467ceca10f681b12d20300c15274f1ea70556e21f99ce54f8e34b7f64e7a4f7e9544a690dda1d7a63228066d3428d6b48e8fb4c406eb58ee4ffef4"

RPROVIDES:${PN} += "libxml++-3-0-1 \
libxml++-3.0.so.1 \
libxml++30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
