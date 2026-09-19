SUMMARY = "Busybox applets replacing sha3sum"
DESCRIPTION = "This package contains the symlinks to replace sha3sum with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-sha3sum-1.38.0-42.2.noarch.rpm"
RPM_HASH = "ce7e2df7f9b6d0dee8e3ed86e9ebd66f91f85f54853d729bb9de725ce41706b81a22393c23fec613c5719ca50a8f852a2f8b37dab26de5a55e5a3c57d4736b7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sha3sum"

RDEPENDS:${PN} += "busybox"

inherit rpm
