SUMMARY = "C++ Interface for XML Files"
DESCRIPTION = "libXML++ provides a C++ interface for XML files. It presently uses \
libxml2 to access the XML files."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.0"

RPM_NAME = "libxml++-4_0-1-4.2.0-1.9.aarch64.rpm"
RPM_HASH = "c73a34d526d575b17db0437b76941abd70945b2829ce65176a02147d4300fdae4e2a84531071fbc578b0a64e4199079fd56405811f401a586f9d801de4223637"

RPROVIDES:${PN} += "libxml++-4-0-1 \
libxml++-4.0.so.1 \
libxml++40"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglibmm-2.68.so.1 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
