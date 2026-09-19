SUMMARY = "API documentation for taglib"
DESCRIPTION = "This package contains the taglib API Documentation in HTML format."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3"

RPM_NAME = "libtag-doc-2.3-1.1.noarch.rpm"
RPM_HASH = "ac0c674945ac10d1fc87658c3ebca840b398bf8f248591d4e2c2898e3e73c07e44cae83648f735c36b06ab4659b15b1b3b2753e378b55d8bf3dea62637d93e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtag-doc"

RDEPENDS:${PN} += ""

inherit rpm
