SUMMARY = "Busybox applets replacing net-tools"
DESCRIPTION = "This package contains the symlinks to replace net-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-net-tools-1.38.0-42.2.noarch.rpm"
RPM_HASH = "953a14b2ca35e90cd436ea32d0d29332ede34b784dc6f38370f626f47443c1fa90840ce1421afbe761d14df47aa7265b2deffdfee6b50c211b3ca897263309eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-net-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
