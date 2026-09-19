SUMMARY = "Documentation for texlive-datestamp"
DESCRIPTION = "This package includes the documentation for texlive-datestamp"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn61719"

RPM_NAME = "texlive-datestamp-doc-2026.226.0.0.3svn61719-61.2.noarch.rpm"
RPM_HASH = "4d533568540c1a73d0efa98086a7146be3c7d0e2c2b7280891713af60c5ab7f097d2e76f9ce2fb091a2a8ac6f460b828064ff21b296871993b93b704aecb35d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datestamp-doc"

RDEPENDS:${PN} += ""

inherit rpm
