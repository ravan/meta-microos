SUMMARY = "Seperate nebula-cert package"
DESCRIPTION = "This package only includes the nebula-cert binary."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "nebula-cert-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "f08971803cfa0f2c60b2830421e45bb948fb27ed77984f2a34f7ff290d94918b2a370ac94e21cb779e01384eb3cf29bafbccc1604609011b2a4f49ee2287544d"

RPROVIDES:${PN} += "nebula-cert"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
