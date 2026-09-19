SUMMARY = "Documentation for texlive-ifoddpage"
DESCRIPTION = "This package includes the documentation for texlive-ifoddpage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-ifoddpage-doc-2026.226.1.2svn77682-60.2.noarch.rpm"
RPM_HASH = "06f64c2c298dc7a58d5983fad552d54e048be6fc43a576af99b2fa2085b5141cd60a3a378bc29bf3ba9b797d1f73bd58eca7c77930ac6b9759fc7f23ea5207b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifoddpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
