SUMMARY = "Documentation for texlive-bibleref-german"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-german"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn21923"

RPM_NAME = "texlive-bibleref-german-doc-2026.226.1.0asvn21923-61.2.noarch.rpm"
RPM_HASH = "cdfd1f1e271f8f37062841ae4307eb65c185b71c6be5a312816b262780a9d6d3bd5da32b4bf6f2229e6a28b8dbd997cc072e71acf79004500a301261b04758de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bibleref-german-doc-de;en \
texlive-bibleref-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
