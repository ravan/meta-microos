SUMMARY = "Development files for libwtmpdb"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that needs to read, write or modify \
the wtmpdb database."
LICENSE = "BSD-2-Clause"

PV = "0.76.0+git20260730.89c0861"

RPM_NAME = "wtmpdb-devel-0.76.0+git20260730.89c0861-1.1.aarch64.rpm"
RPM_HASH = "d2be82078df9675ac0edd8ae4ea6220ede4f0a649df9f5e64f2c53db88a2df4345f7e03bf890098da6d16b755ee728685896bbbbf7a9f73484c48ae15309672f"

RPROVIDES:${PN} += "pkgconfig-libwtmpdb \
wtmpdb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwtmpdb0"

inherit rpm
