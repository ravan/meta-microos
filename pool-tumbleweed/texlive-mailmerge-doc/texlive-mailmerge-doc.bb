SUMMARY = "Documentation for texlive-mailmerge"
DESCRIPTION = "This package includes the documentation for texlive-mailmerge"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-mailmerge-doc-2026.226.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "11eb6a06b3d69443b34c41320e4f2512d5af5736c61d423d52a9c763849dee740ffe8595e2b078f7300bf1db5c97389afed6608e14e6c55f1b1f825307766a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mailmerge-doc"

RDEPENDS:${PN} += ""

inherit rpm
