SUMMARY = "Documentation for texlive-gensymb"
DESCRIPTION = "This package includes the documentation for texlive-gensymb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77682"

RPM_NAME = "texlive-gensymb-doc-2026.226.1.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "263b2ef78c2ecb788a615809f174298b15d6086fa86e0701a1cc84652e81ba7cda5cbe513830d91bca18edba4e5264d95f3138189777c33b51d4d94df0fd89f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gensymb-doc"

RDEPENDS:${PN} += ""

inherit rpm
