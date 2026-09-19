SUMMARY = "Documentation for texlive-pst-abspos"
DESCRIPTION = "This package includes the documentation for texlive-pst-abspos"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-pst-abspos-doc-2026.226.0.0.2svn15878-59.2.noarch.rpm"
RPM_HASH = "a5ecc4d43802f7b91961bb289af838e10d98cd867e041ebe72d1cf9c407ce4e8d957dfda4d7ca5ce0a379f172d580c50621462017fbf244660116ef1aff3ea72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-abspos-doc"

RDEPENDS:${PN} += ""

inherit rpm
