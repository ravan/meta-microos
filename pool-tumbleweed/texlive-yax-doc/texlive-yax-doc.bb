SUMMARY = "Documentation for texlive-yax"
DESCRIPTION = "This package includes the documentation for texlive-yax"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn54080"

RPM_NAME = "texlive-yax-doc-2026.226.1.03svn54080-59.4.noarch.rpm"
RPM_HASH = "c1f3320ba4e37abd189228b14f6ed6411ce14ca8561311338b82ecf4db6ed320963cfdc32633c5543d93e005df29333b5f0b3dd93b4faa290fa62067ea16ad6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yax-doc"

RDEPENDS:${PN} += ""

inherit rpm
