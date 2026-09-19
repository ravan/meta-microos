SUMMARY = "Documentation for texlive-ktv-texdata"
DESCRIPTION = "This package includes the documentation for texlive-ktv-texdata"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.05.34svn27369"

RPM_NAME = "texlive-ktv-texdata-doc-2026.226.05.34svn27369-63.2.noarch.rpm"
RPM_HASH = "c54b207d8c709a966d1f44c700ef9e30107d264b6cdf5393370f6b941f5489c3a361eea3d4f36e05fdf88291e88c5a7ffd45455b5f63fb5942ab1a781023038c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ktv-texdata-doc"

RDEPENDS:${PN} += ""

inherit rpm
