SUMMARY = "Documentation for texlive-constants"
DESCRIPTION = "This package includes the documentation for texlive-constants"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-constants-doc-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "a39f5fc355085f034c4dbf46704b113fc9ac4ec08aa9e15b1de7af411da4dafbe557d7d7f9eb71aa135195ef8e5d2d738edd85ba8199222dc7d953c57866a58d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-constants-doc"

RDEPENDS:${PN} += ""

inherit rpm
