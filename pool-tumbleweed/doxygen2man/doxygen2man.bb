SUMMARY = "tool to generate man pages from Doxygen XML files"
DESCRIPTION = "The doxygen2man package contains the doxygen2man utility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.9+20250916.4b496d0"

RPM_NAME = "doxygen2man-2.0.9+20250916.4b496d0-1.5.aarch64.rpm"
RPM_HASH = "a937d7395dac1e7464c6112f4e66ccb9294333c06dfeaa874acb07813ebc3022c361773f0e8d9b03145e3e0d11511da1d3fc816f540c267b32581f16b4da20ba"

RPROVIDES:${PN} += "doxygen2man"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqb.so.100 \
libqb100 \
libxml2.so.16"

inherit rpm
