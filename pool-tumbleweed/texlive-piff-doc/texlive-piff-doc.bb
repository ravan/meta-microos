SUMMARY = "Documentation for texlive-piff"
DESCRIPTION = "This package includes the documentation for texlive-piff"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn21894"

RPM_NAME = "texlive-piff-doc-2026.226.svn21894-58.2.noarch.rpm"
RPM_HASH = "41f2a1f9ad3958480431f42180efb93df171df343550f636bdeb2eacdd192f8ccc9583acbe05e8df907782e03b2b8ca6b6e662abc72768a6ea3038222d483ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piff-doc"

RDEPENDS:${PN} += ""

inherit rpm
