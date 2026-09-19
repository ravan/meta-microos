SUMMARY = "Busybox applets replacing findutils"
DESCRIPTION = "This package contains the symlinks to replace findutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-findutils-1.38.0-42.2.noarch.rpm"
RPM_HASH = "de198de46e2d818e737c6eb1e335e90996dd8fa61a0d5da295fa9c756f88d388ac9052e1c44b9c762ced53492fe277a3773a84977ec46396ad28fe83da6d590e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-findutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
