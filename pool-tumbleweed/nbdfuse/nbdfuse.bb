SUMMARY = "FUSE support for libnbd"
DESCRIPTION = "This package contains FUSE support for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25.7"

RPM_NAME = "nbdfuse-1.25.7-1.1.aarch64.rpm"
RPM_HASH = "3f1a00f42965836b936418ad2f2b8a647d6c0ce8ed1a7763864487d229d49b2e05b4e63f4325559de40859e607d1c94bbb3f3fa30ba3a0c3c483c464eb06e22b"

RPROVIDES:${PN} += "nbdfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libnbd.so.0 \
libnbd0"

inherit rpm
