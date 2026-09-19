SUMMARY = "Development files for libparserutils"
DESCRIPTION = "The libparserutils-devel package contains libraries and header files for \
developing applications that use libparserutils."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "libparserutils-devel-0.2.4-3.9.aarch64.rpm"
RPM_HASH = "3321e030ae5ebe2aa6b4a09995ded8ea781262af3c7954fd47bc75cd8ebf5102a9b9091392cda49bbd0f317eaabdb3264cc4b1ef4f2c6efd7809686c024dcd93"

RPROVIDES:${PN} += "libparserutils-devel \
pkgconfig-libparserutils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libparserutils0"

inherit rpm
