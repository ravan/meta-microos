SUMMARY = "The official CLI for GitHub"
DESCRIPTION = "Official CLI client for GitHub written in Go"
LICENSE = "MIT"

PV = "2.100.0"

RPM_NAME = "gh-2.100.0-1.1.aarch64.rpm"
RPM_HASH = "620d0370b5d9bb6a12ccb02ef53c6aa7f9c209e146faf702e931f2433aed2eff99af306641c573fd6c505e960f6a187c592af163d68e188943dcf85e55c72240"

RPROVIDES:${PN} += "gh"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
