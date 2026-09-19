SUMMARY = "Documentation for texlive-pdfmsym"
DESCRIPTION = "This package includes the documentation for texlive-pdfmsym"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn66618"

RPM_NAME = "texlive-pdfmsym-doc-2026.226.1.1.1svn66618-58.2.noarch.rpm"
RPM_HASH = "25755c814a55e6dbd48789cff44f3ee02f5c2126c2e5b99f621a6687a61931313cd628efe04a550e7f23713ff06e553c9fc045a1962870c55d406021bff857ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfmsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
