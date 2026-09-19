SUMMARY = "Development files for libcbor"
DESCRIPTION = "libcbor is a C library for parsing and generating CBOR. \
The libcbor-devel contains libraries and header files for libcbor."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "libcbor-devel-0.14.0-1.3.aarch64.rpm"
RPM_HASH = "1a6e526166ab3450d07eda7e497eb334073a95ad4733ff75a1f0b0a49b27f60cbfcec098d056520580607378c995fb1b49346b880c6d9e07b8ada4f39d469061"

RPROVIDES:${PN} += "cmake-libcbor \
libcbor-devel \
pkgconfig-libcbor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcbor0-14"

inherit rpm
