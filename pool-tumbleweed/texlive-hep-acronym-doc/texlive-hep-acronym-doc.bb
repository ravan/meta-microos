SUMMARY = "Documentation for texlive-hep-acronym"
DESCRIPTION = "This package includes the documentation for texlive-hep-acronym"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-acronym-doc-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "56dd8cb43571d2a5cd4efa68682604febc4cf0cf6afb3cedc1ee6d2bc8b3f06945d65c74eee0c38f3559d73f472371aa598a0bc19f64d70075b8620f412f7abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-acronym-doc"

RDEPENDS:${PN} += ""

inherit rpm
