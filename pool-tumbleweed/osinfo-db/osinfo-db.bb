SUMMARY = "Osinfo database files"
DESCRIPTION = "The osinfo database provides information about operating systems and \
hypervisor platforms to facilitate the automated configuration and \
provisioning of new virtual machines"
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "20260812"

RPM_NAME = "osinfo-db-20260812-1.1.noarch.rpm"
RPM_HASH = "71ac7d83fa8f1a0f81966d125185f4d942a79dc19cc40c6bdec170f278a22ada55133dafd263ce60ad907dd5edcaf8700f802e069d8318fe8121f5855c7daf04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osinfo-db"

RDEPENDS:${PN} += ""

inherit rpm
