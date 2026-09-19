SUMMARY = "Busybox applets replacing netcat"
DESCRIPTION = "This package contains the symlinks to provide nc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-netcat-1.38.0-42.2.noarch.rpm"
RPM_HASH = "75a299832173e23eebcb9388b318c1bac0e946fea0ba477e32d6f81dd6e7509276b813c957fe598296caae365e25dadcf771538c67da25cf382ae2fd541aa759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-netcat"

RDEPENDS:${PN} += "busybox"

inherit rpm
