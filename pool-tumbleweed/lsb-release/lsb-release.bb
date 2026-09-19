SUMMARY = "Linux Standard Base Release Tools"
DESCRIPTION = "Tools from the Linux Standard Base project to determine the used distribution"
LICENSE = "GPL-2.0-or-later"

PV = "3.3"

RPM_NAME = "lsb-release-3.3-1.9.noarch.rpm"
RPM_HASH = "17ff74b1bc96e574064030c127a9d210ffc41023717ef6e87806374fc2f11ded24edea06755b05f2e410b6790ddb1b31b9ea1c18c70e5f708d032be1f44b54ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsb-release"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
