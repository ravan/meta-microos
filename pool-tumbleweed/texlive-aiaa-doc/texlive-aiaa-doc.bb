SUMMARY = "Documentation for texlive-aiaa"
DESCRIPTION = "This package includes the documentation for texlive-aiaa"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn15878"

RPM_NAME = "texlive-aiaa-doc-2026.226.3.6svn15878-61.2.noarch.rpm"
RPM_HASH = "a35cb02b5a5f6ca88b47c791f7a28b5a37f52b977c608aab4e28e4276c3b22852c776e2a6c230d9488d4dd894bf04b26f418d203b18d0007d7a5b25e958aa774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aiaa-doc"

RDEPENDS:${PN} += ""

inherit rpm
