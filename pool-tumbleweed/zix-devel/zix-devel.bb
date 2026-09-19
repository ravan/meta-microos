SUMMARY = "Development files for zix library"
DESCRIPTION = "Zix is a lightweight C library of portability wrappers and data structures, such as: \
Allocation \
Algorithms \
Data Structures \
Threading \
File System"
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "zix-devel-0.8.0-1.4.aarch64.rpm"
RPM_HASH = "7a286d0f98bcfe99c1b9938d6aba30b8f9abe28c4e77139fd723658bd80b72cbbe54425919cd270dde6000461f87fe3c53ba9a478710e6ac4b7431acdc780d4b"

RPROVIDES:${PN} += "pkgconfig-zix-0 \
zix-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzix-0-0"

inherit rpm
