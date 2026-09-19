SUMMARY = "Documentation for texlive-xecyrmongolian"
DESCRIPTION = "This package includes the documentation for texlive-xecyrmongolian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn53160"

RPM_NAME = "texlive-xecyrmongolian-doc-2026.226.1.0svn53160-59.4.noarch.rpm"
RPM_HASH = "721988372af3611464ec0db543c75c625525618bedd2e4f68087db183e17eaf0aa6e44b7b671391a39de9ad60f678942905066588a53d6c6c615882ec8150ca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xecyrmongolian-doc"

RDEPENDS:${PN} += ""

inherit rpm
