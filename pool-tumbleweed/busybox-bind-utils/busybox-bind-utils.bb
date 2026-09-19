SUMMARY = "Busybox applets replacing bind-utils"
DESCRIPTION = "This package contains the symlinks to replace bind-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-bind-utils-1.38.0-42.2.noarch.rpm"
RPM_HASH = "4d7d7fc1b37e1e8ebfbc82b228bfae87bf953692ef487a8d691dc9fafeffb5bf8a483f6590ac6ac5660fd856668421018414b5b71cdbb5c5004d508f2dca45bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bind-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
