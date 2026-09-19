SUMMARY = "Documentation for texlive-luaquotes"
DESCRIPTION = "This package includes the documentation for texlive-luaquotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn65652"

RPM_NAME = "texlive-luaquotes-doc-2026.226.1.4.0svn65652-59.2.noarch.rpm"
RPM_HASH = "51919a86026c009ac8b39cfb1d9fa48782dcf1a41566f339a3a6445d3453d31ff86b62fa00fe97217e1ed8ee6e94b76b541b46eff817a442993352c47d6db906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaquotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
