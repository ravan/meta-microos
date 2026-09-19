SUMMARY = "Busybox applets replacing time"
DESCRIPTION = "This package contains the symlinks to provide time with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-time-1.38.0-42.2.noarch.rpm"
RPM_HASH = "b5b98874fd3a3d9d48dc010f773145699480318a2b9c8266d5867d1c6cf7eb1b195bfa15b95ef61749bed519cfb6f6452b5cd060174e05dacb3d5e943265e8b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-time"

RDEPENDS:${PN} += "busybox"

inherit rpm
