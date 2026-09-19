SUMMARY = "Development package for KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Development package for kpmcore."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kpmcore-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a086384e35b3fcedd76dfeded9aca29557ed12155d45ada3a42501a00ecb5500f62ac8d706e94739276964ef75373bfaade721c7485b490b002eca4049d2b16c"

RPROVIDES:${PN} += "cmake-KPMcore \
kpmcore-devel"

RDEPENDS:${PN} += "libkpmcore13"

inherit rpm
