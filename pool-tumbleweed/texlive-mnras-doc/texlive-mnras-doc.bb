SUMMARY = "Documentation for texlive-mnras"
DESCRIPTION = "This package includes the documentation for texlive-mnras"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn68878"

RPM_NAME = "texlive-mnras-doc-2026.226.3.2svn68878-61.2.noarch.rpm"
RPM_HASH = "ab7421cd83fda769c854258e97f7cd45eb1eff66d6f599fb2d843f4d5e9c7e073ff3f1b5b2fb5b6417fb10198dd070f701fb41687dd787fa5a22fadf6d7a55fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mnras-doc"

RDEPENDS:${PN} += ""

inherit rpm
