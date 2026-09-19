SUMMARY = "Icons required by libksane library"
DESCRIPTION = "Icons required by libksane library."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "libksane-icons-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d39520108f40f2ee690ca6cc55c02a0fc5a201def149e2c82da30f6c073820e0418a6f15746a5a484bc1a90c12b7b8dbf0d4811143d7af12194b8970e23dd3d7"

RPROVIDES:${PN} += "libksane-icons"

RDEPENDS:${PN} += ""

inherit rpm
