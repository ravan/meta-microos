SUMMARY = "Busybox applets replacing diffutils"
DESCRIPTION = "This package contains the symlinks to replace diffutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-diffutils-1.38.0-42.2.noarch.rpm"
RPM_HASH = "2db94c720476b087ffbce46649f27827383355b6d872aacc3a7739e0706facc45bb6eaccc3c137f8593659f40ccf6c079d681c31ef30282d840ab2f3d19e687c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-diffutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
