SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.0+git20260911.f4f012f3"

RPM_NAME = "rpmlint-test-2.10.0+git20260911.f4f012f3-1.1.noarch.rpm"
RPM_HASH = "19430eedea1fe82551a202e3969432c8db329446eb3fc006b71ac9f0e6dd0a3ac40e25a940a19341d80cc3d8f863dedf08efc892dc44ddbdbdd12fe58b1db61d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmlint-test"

RDEPENDS:${PN} += ""

inherit rpm
