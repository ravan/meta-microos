SUMMARY = "Busybox applets replacing bc"
DESCRIPTION = "This package contains the symlinks to provide bc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-bc-1.38.0-42.2.noarch.rpm"
RPM_HASH = "baa068be244cf1ffaad8d35e71156111ce20fa5204d7ada6f9a5a4d509112dc70eaa7cc9b40697f9530a12f119f51412e22a49d3460743a92a3b23c540aabb47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bc"

RDEPENDS:${PN} += "busybox"

inherit rpm
