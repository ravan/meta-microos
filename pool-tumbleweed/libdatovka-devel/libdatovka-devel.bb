SUMMARY = "Development files for libdatovka"
DESCRIPTION = "The libdatovka-devel package contains libraries and header files for \
developing applications that use libdatovka."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.4"

RPM_NAME = "libdatovka-devel-0.7.4-1.1.aarch64.rpm"
RPM_HASH = "fc1d721c0e8c4858bdecb400793d44fa019bc86d20734c0e6afbe5d0d6e50cf01ac9bfc587e5b1d24c40ff43b538e1a6e8eb55285323ffdab971c44a9304ef5a"

RPROVIDES:${PN} += "libdatovka-devel \
pkgconfig-libdatovka"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdatovka8 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0"

inherit rpm
