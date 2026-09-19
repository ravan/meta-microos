SUMMARY = "Busybox applets replacing sed"
DESCRIPTION = "This package contains the symlinks to replace sed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-sed-1.38.0-42.2.noarch.rpm"
RPM_HASH = "e1f030d28bd3e1a2762845856ad12adb1531438c0924bf96e41aee6b5865c271ad0b9ade35ec4530ec54fc8897b4857683cc99e1974da4903188e09cd097061b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sed \
busybox-sed"

RDEPENDS:${PN} += "busybox"

inherit rpm
