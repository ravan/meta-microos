SUMMARY = "Documentation for texlive-mnotes"
DESCRIPTION = "This package includes the documentation for texlive-mnotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn63406"

RPM_NAME = "texlive-mnotes-doc-2026.226.0.0.9svn63406-61.2.noarch.rpm"
RPM_HASH = "d74075937209645ea978b322637a6401cc26b4a53e296b8398e0d9aa28bacb0c59b2726ff5b07f163dd83f3495793bb85a52cd097cac3e568e36cd3a12025d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
