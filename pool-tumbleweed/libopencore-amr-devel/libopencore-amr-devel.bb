SUMMARY = "Devel and header files for AMR"
DESCRIPTION = "Library of OpenCORE Framework implementation of Adaptive Multi Rate \
Narrowband and Wideband speech codec. \
Developer Package."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "libopencore-amr-devel-0.1.6-1.14.aarch64.rpm"
RPM_HASH = "5c7678c282a0bca197ccdf33d3de97c7873b77404a5aacfc12aebdbab6dfb44b35c49b271847d383dabfbd0cb4cf53bd722091ef9ed2c63b89e0ac1fc5191468"

RPROVIDES:${PN} += "libopencore-amr-devel \
pkgconfig-opencore-amrnb \
pkgconfig-opencore-amrwb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopencore-amrnb0 \
libopencore-amrwb0"

inherit rpm
