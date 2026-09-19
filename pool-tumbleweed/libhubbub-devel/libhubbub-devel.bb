SUMMARY = "Development files for libhubbub"
DESCRIPTION = "The libhubbub-devel package contains libraries and header files for \
developing applications that use libhubbub."
LICENSE = "MIT"

PV = "0.3.7"

RPM_NAME = "libhubbub-devel-0.3.7-2.20.aarch64.rpm"
RPM_HASH = "52c007a0f84cb2172470674f4ff9ed26b5a4e7a6a3994bc2932f5f8d81425d17bda2a4cbdbc15f36b07a2ee023454bf2c80c6ad164568e31c53199ad1c9988c0"

RPROVIDES:${PN} += "libhubbub-devel \
pkgconfig-libhubbub"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhubbub0 \
pkgconfig-libparserutils"

inherit rpm
