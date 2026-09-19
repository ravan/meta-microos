SUMMARY = "Documentation for texlive-guitarchordschemes"
DESCRIPTION = "This package includes the documentation for texlive-guitarchordschemes"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn54512"

RPM_NAME = "texlive-guitarchordschemes-doc-2026.226.0.0.7svn54512-60.4.noarch.rpm"
RPM_HASH = "2f104ac974f29a10698e91c0e5242b4e3cf96b4f9232cfdbe142fc860161ca1b52d3f59292a3ba3a5ae4d1435a5ee3199449790575a7f4b628f557f9bf967d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-guitarchordschemes-doc-en \
texlive-guitarchordschemes-doc"

RDEPENDS:${PN} += ""

inherit rpm
