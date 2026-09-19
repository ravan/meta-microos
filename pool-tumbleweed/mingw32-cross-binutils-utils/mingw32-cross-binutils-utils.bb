SUMMARY = "Utilities for packaging support"
DESCRIPTION = "Utilities (like strip and objdump) which are needed for generating package"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.45.1"

RPM_NAME = "mingw32-cross-binutils-utils-2.45.1-3.4.aarch64.rpm"
RPM_HASH = "0e0df9a4c578dd6694f8905b0f164bf8f64d349b98d7309a28d5b5ad76b9ee124ef578bdf89004e5af31ec897516d234d40c3dee98ebc139313472942fa4a387"

RPROVIDES:${PN} += "mingw32-cross-binutils-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
