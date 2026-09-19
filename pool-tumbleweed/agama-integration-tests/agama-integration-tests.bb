SUMMARY = "Example Agama integration tests"
DESCRIPTION = "This package provides only few example integration tests, the real tests should be added from \
outside. \
 \
All needed NPM dependencies are bundled into the tests themselves, there are no external \
dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "1785848065.5562c7c"

RPM_NAME = "agama-integration-tests-1785848065.5562c7c-4.1.noarch.rpm"
RPM_HASH = "c974dc38a8ad1e3da98db7203c04dc3df4fac83439d0f4ea6b777e8a8daddc6e1c2d65bc38fddac27aabea3c5ae7680c26d4d6079d0b1a7faeae886197e03181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "agama-integration-tests"

RDEPENDS:${PN} += "nodejs-engine"

inherit rpm
