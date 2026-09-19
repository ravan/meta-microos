SUMMARY = "Development files for libsecp256k1"
DESCRIPTION = "The libsecp256k1-devel package contains libraries and header files for developing applications that use libsecp256k1."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libsecp256k1-devel-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "a19cdc4ec3ac5edd5967db67ce974b3f2adebb5c7338df3fcce8e0be97ea8af9d67f0038d00a69883397d303d5edb76d31fb9da179daf3cf69974f8f82a4520b"

RPROVIDES:${PN} += "libsecp256k1-devel \
pkgconfig-libsecp256k1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsecp256k1-7"

inherit rpm
