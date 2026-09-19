SUMMARY = "Documentation for texlive-opencolor"
DESCRIPTION = "This package includes the documentation for texlive-opencolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn66363"

RPM_NAME = "texlive-opencolor-doc-2026.226.1.0.1svn66363-61.2.noarch.rpm"
RPM_HASH = "79adf970af1c6ce1ca91c6ed7b06f882b8bf1a290676b12fd87e053bfcf4b57b1541700a77747809cd524b1a8ada83e0af1c78c5044b7284d5fd78dc4a881c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opencolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
