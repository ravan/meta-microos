SUMMARY = "Busybox applets replacing kbd"
DESCRIPTION = "This package contains the symlinks to replace kbd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-kbd-1.38.0-42.2.noarch.rpm"
RPM_HASH = "05053fa8891ea43687849f3e98fa6146fce7d263a63a9c280696cf918ac3ac0d4f7cd5c4da4300d574ceb119e6460ee8e55e2b45319205c45616778a8e65b29c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-kbd"

RDEPENDS:${PN} += "busybox"

inherit rpm
