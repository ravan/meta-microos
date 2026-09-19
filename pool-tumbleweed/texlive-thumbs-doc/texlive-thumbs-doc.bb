SUMMARY = "Documentation for texlive-thumbs"
DESCRIPTION = "This package includes the documentation for texlive-thumbs"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1dsvn77682"

RPM_NAME = "texlive-thumbs-doc-2026.227.1.1dsvn77682-62.2.noarch.rpm"
RPM_HASH = "cc1b087296fd459def8cf5f097d5247debf37846ee04da5256c4e98044faa1f952192aee171094c69c6e8973209eed43467d81fd5ee320403c7a6ea38f16e4b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thumbs-doc"

RDEPENDS:${PN} += ""

inherit rpm
