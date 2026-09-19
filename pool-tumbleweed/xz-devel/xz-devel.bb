SUMMARY = "Development package for the LZMA library"
DESCRIPTION = "This package contains the header files and libraries needed for \
compiling programs using the LZMA library."
LICENSE = "0BSD"

PV = "5.8.3"

RPM_NAME = "xz-devel-5.8.3-1.3.aarch64.rpm"
RPM_HASH = "e66608550cba0cf9d9d6b4bba51aed95e3e4b93bc13a87e962cdde69c48c483492ea4f35387eaa458574dd9b20ce5d3c7aff5ee9a6afef9486b80eb61bb6af1e"

RPROVIDES:${PN} += "lzma-alpha-devel \
lzma-devel \
pkgconfig-liblzma \
xz-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblzma5"

inherit rpm
