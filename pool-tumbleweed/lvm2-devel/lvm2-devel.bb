SUMMARY = "Development files for LVM2"
DESCRIPTION = "This package provides development files for the LVM2 Logical Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.38"

RPM_NAME = "lvm2-devel-2.03.38-2.5.aarch64.rpm"
RPM_HASH = "fb308ddbc6360e9c3989c7f819df476eb5c3ca0e2099b922d896b720282164710c0311437afcb8fb3b23462f234cb95d7e70442585fa9f52699ebc8aa12887be"

RPROVIDES:${PN} += "lvm2-devel"

RDEPENDS:${PN} += "device-mapper-devel \
liblvm2cmd2-03 \
lvm2"

inherit rpm
