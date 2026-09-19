SUMMARY = "Documentation for texlive-oldstandard"
DESCRIPTION = "This package includes the documentation for texlive-oldstandard"
LICENSE = "OFL-1.1"

PV = "2026.226.2.7asvn70421"

RPM_NAME = "texlive-oldstandard-doc-2026.226.2.7asvn70421-61.2.noarch.rpm"
RPM_HASH = "2b4037af32910743af4f55f593631de37cbacf0d462f807236a6aa432450346ef305b362e08e88611a86d2d70307dc7a2d5e3114dca50ea120f436fc2c5cbfa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oldstandard-doc"

RDEPENDS:${PN} += ""

inherit rpm
