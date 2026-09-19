SUMMARY = "Documentation for texlive-unicode-data"
DESCRIPTION = "This package includes the documentation for texlive-unicode-data"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.19svn76413"

RPM_NAME = "texlive-unicode-data-doc-2026.226.1.19svn76413-60.2.noarch.rpm"
RPM_HASH = "f176571e5c9fbb12a37a56a96595e4afade28df42472c479eefcd9a3a5351f209b41ff73f846fe7371d5bc324ac61b3719df7e887a56476a6edbd46e8629dfb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-data-doc"

RDEPENDS:${PN} += ""

inherit rpm
