SUMMARY = "Main library for twin"
DESCRIPTION = "Development files for twin main library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+161"

RPM_NAME = "libtw-devel-0.9.0+161-1.5.aarch64.rpm"
RPM_HASH = "9b722f8767db0fa44fdc72bd4b921a2480116eb5a6c85f0e448e135168f462d6d99257be5125dd1861cfc7833cbb2b34dec15fdb9237337fc19f673a96b2a979"

RPROVIDES:${PN} += "libTw-devel \
libtw-devel"

RDEPENDS:${PN} += "libtstl1 \
libtw1"

inherit rpm
