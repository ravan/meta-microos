SUMMARY = "Documentation for texlive-utf8add"
DESCRIPTION = "This package includes the documentation for texlive-utf8add"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn61074"

RPM_NAME = "texlive-utf8add-doc-2026.226.svn61074-60.2.noarch.rpm"
RPM_HASH = "6b9fe3bb958686e4ded1b2e2345d37f68499753218e7e4ce6bc0b48ca773299b25d908b35d47a652b0d08da3d49d5dcaaf442fc58947f200901c6fc290175cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utf8add-doc"

RDEPENDS:${PN} += ""

inherit rpm
