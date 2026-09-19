SUMMARY = "Documentation for gocryptfs"
DESCRIPTION = "This package contains the documentation files for gocryptfs."
LICENSE = "MIT"

PV = "2.6.1"

RPM_NAME = "gocryptfs-doc-2.6.1-1.9.noarch.rpm"
RPM_HASH = "ffbb16ed09d1df215acafe8cb450bd95ac6f447513db1992fe4af6c20867af2d2d04d8f909e5a3545dd93cd95577062645c17c8e3f4d0611dd0157fadcbd8ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gocryptfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
