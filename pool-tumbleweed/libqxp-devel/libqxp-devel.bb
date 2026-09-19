SUMMARY = "Development files for libqxp"
DESCRIPTION = "The libqxp-devel package contains libraries and header files for \
developing applications that use libqxp."
LICENSE = "MPL-2.0"

PV = "0.0.3"

RPM_NAME = "libqxp-devel-0.0.3-2.3.aarch64.rpm"
RPM_HASH = "e60523efcb0e923c7546ca924b5cda8c2af5eca160c9bf174ef64da0c0494280fccf0b9f1d49b5d8cdf016f677ace4af3f7c426088b6c222cad6ad865f7be004"

RPROVIDES:${PN} += "libqxp-devel \
pkgconfig-libqxp-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqxp-0-0-0 \
pkgconfig-librevenge-0.0"

inherit rpm
