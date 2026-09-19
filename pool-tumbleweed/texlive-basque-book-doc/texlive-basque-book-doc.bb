SUMMARY = "Documentation for texlive-basque-book"
DESCRIPTION = "This package includes the documentation for texlive-basque-book"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn32924"

RPM_NAME = "texlive-basque-book-doc-2026.226.1.20svn32924-60.2.noarch.rpm"
RPM_HASH = "5414d2cfba4127d58fa3ab65e03e840a37db3b5705c73ceed868102a6b020c82e4436ebc5ec753653a51ec82a2b69eb6bd8312686ee7751ba3159cd143f8884c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-basque-book-doc-en;eu \
texlive-basque-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
