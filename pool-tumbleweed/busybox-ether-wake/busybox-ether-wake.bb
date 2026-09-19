SUMMARY = "Busybox applets replacing ether-wake"
DESCRIPTION = "This package contains the symlink to replace ether-wake from older \
downstream versions of net-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-ether-wake-1.38.0-42.2.noarch.rpm"
RPM_HASH = "c42a88a060edd79c77a1f3605a93fa48742f5594c9c8f02cb37a36149bb7d32d73c7286df4f2631d2fa93a5dbffb8e4cb658637fab8333e21fd745b085721777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ether-wake"

RDEPENDS:${PN} += "busybox"

inherit rpm
