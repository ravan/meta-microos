SUMMARY = "Documentation for texlive-chet"
DESCRIPTION = "This package includes the documentation for texlive-chet"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn45081"

RPM_NAME = "texlive-chet-doc-2026.226.2.2svn45081-60.2.noarch.rpm"
RPM_HASH = "02ba015ae38b7b63c0d61ffa1748251a3403d4679af275060214911a7091699f25f403465167990b95789bdb5ac379f26f5a9daf6c71aa4d271574ed2c24adcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chet-doc"

RDEPENDS:${PN} += ""

inherit rpm
