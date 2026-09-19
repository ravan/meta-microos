SUMMARY = "Documentation for texlive-babel-estonian"
DESCRIPTION = "This package includes the documentation for texlive-babel-estonian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn38064"

RPM_NAME = "texlive-babel-estonian-doc-2026.226.1.1asvn38064-60.2.noarch.rpm"
RPM_HASH = "5a640fe6f2611d6b07fff478b24d7236c5deca31051f36fccb3972985955d4c15e7c5726b9b137e6be5be1383be02065318acc0c2b34e286676a29fa07267fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-estonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
