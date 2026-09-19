SUMMARY = "Documentation for texlive-fira"
DESCRIPTION = "This package includes the documentation for texlive-fira"
LICENSE = "OFL-1.1"

PV = "2026.226.4.3svn77682"

RPM_NAME = "texlive-fira-doc-2026.226.4.3svn77682-59.2.noarch.rpm"
RPM_HASH = "418422c68f9256a5840c46b93fd97d3a843ffc072957f82a0783b951a948fa00c8b8b1a2c65bbcb6117de78f71382ee5810004780cbc72e1cce2d343324bf4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fira-doc"

RDEPENDS:${PN} += ""

inherit rpm
