SUMMARY = "Documentation for texlive-jsonresume"
DESCRIPTION = "This package includes the documentation for texlive-jsonresume"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77560"

RPM_NAME = "texlive-jsonresume-doc-2026.226.1.0.2svn77560-63.2.noarch.rpm"
RPM_HASH = "208facdba76f4abc7b806e44f59fb3a028076d5eaad18ee0a17e29626776ea3a6ba73add1dcfea6bb20c33ae079dd85a2c37ff41c8d85c3c7bce05bc402966d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jsonresume-doc"

RDEPENDS:${PN} += ""

inherit rpm
