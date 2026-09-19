SUMMARY = "Busybox applets replacing psmisc"
DESCRIPTION = "This package contains the symlinks to replace psmisc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-psmisc-1.38.0-42.2.noarch.rpm"
RPM_HASH = "f53fb54df517573bddc32b3a572f96a782cf6f978d4bec5da185b152c3c02a122a98e798d4b560f127e61411907e508edad170876aa04a20917d0020466b3ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/fuser \
busybox-psmisc"

RDEPENDS:${PN} += "busybox"

inherit rpm
