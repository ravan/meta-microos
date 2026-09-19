SUMMARY = "Documentation for Oggz"
DESCRIPTION = "This package contains HTML documentation needed for development using \
liboggz"
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "liboggz-doc-1.1.3-2.4.noarch.rpm"
RPM_HASH = "c045818fef0fa1aebc57368e41a247f615a77ac33f55c0bf75ff109b4fe10b85a1a98834d22cae0b1c24d8295abdee045020cba6537af69098be992c6f551aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liboggz-doc"

RDEPENDS:${PN} += "liboggz2"

inherit rpm
