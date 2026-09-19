SUMMARY = "Busybox applets replacing ncurses-utils"
DESCRIPTION = "This package contains the symlinks to replace ncurses-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-ncurses-utils-1.38.0-42.2.noarch.rpm"
RPM_HASH = "e1db93831b7e5a1498cba4436f44907bd2c437652acc85d5a7ec7729e546cee069e03258f3b9efba253a3415cdbf82b193776cdfaf2cb7120b4b492d5e9c0f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ncurses-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
