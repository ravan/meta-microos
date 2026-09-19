SUMMARY = "Documentation for texlive-ucharclasses"
DESCRIPTION = "This package includes the documentation for texlive-ucharclasses"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.6svn77682"

RPM_NAME = "texlive-ucharclasses-doc-2026.226.2.6svn77682-60.2.noarch.rpm"
RPM_HASH = "eea49aed3f00d85f3bdc4637b8ef6b83d808de71320c341051f9828ba943288413245d85e91dd28d9540956b626c41cedf8c0b9f9873e074e5813dc52b6b678c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucharclasses-doc"

RDEPENDS:${PN} += ""

inherit rpm
