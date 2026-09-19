SUMMARY = "Documentation for texlive-beamertools"
DESCRIPTION = "This package includes the documentation for texlive-beamertools"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76639"

RPM_NAME = "texlive-beamertools-doc-2026.226.0.0.1svn76639-61.2.noarch.rpm"
RPM_HASH = "c1d8a17f4ef489465ee2083ccafa9395e6a602495f623f3a3f8e5c92acd804e1b340f681cd0357761c187bba136ad251d865eb2fe492b32cb17d734c1179d4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertools-doc"

RDEPENDS:${PN} += ""

inherit rpm
