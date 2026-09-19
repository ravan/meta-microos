SUMMARY = "Development files for libext2fs"
DESCRIPTION = "Development files for libext2fs. Static libraries."
LICENSE = "LGPL-2.0-only"

PV = "1.47.3"

RPM_NAME = "libext2fs-devel-static-1.47.3-2.2.aarch64.rpm"
RPM_HASH = "8df8342af205e8db4378e23fefda8c84e3ce24d0647c754bb33a01ddab7126e55a7c040fd8d4067de4ece03a86d5ac42436216332d277cc64748352fc5a5aad1"

RPROVIDES:${PN} += "libext2fs-devel-/usr/lib64/libe2p.a \
libext2fs-devel-/usr/lib64/libext2fs.a \
libext2fs-devel-static"

RDEPENDS:${PN} += "libext2fs-devel"

inherit rpm
