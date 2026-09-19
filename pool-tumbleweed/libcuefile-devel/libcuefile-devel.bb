SUMMARY = "Development files for libcuefile"
DESCRIPTION = "This package includes development files for libcuefile."
LICENSE = "GPL-2.0-only"

PV = "r475"

RPM_NAME = "libcuefile-devel-r475-4.9.aarch64.rpm"
RPM_HASH = "0c6552ceb67b22912ba92114deb66a31a0087d1aef9eb986b51cc5e3b7154594f8383fbde1f47bbd0df106de357227d596e77d6ef3f7c0b73fb1af32bbd105bc"

RPROVIDES:${PN} += "libcuefile-devel"

RDEPENDS:${PN} += "libcuefile0"

inherit rpm
