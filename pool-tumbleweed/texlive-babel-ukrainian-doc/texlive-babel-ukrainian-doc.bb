SUMMARY = "Documentation for texlive-babel-ukrainian"
DESCRIPTION = "This package includes the documentation for texlive-babel-ukrainian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4esvn56674"

RPM_NAME = "texlive-babel-ukrainian-doc-2026.226.1.4esvn56674-60.2.noarch.rpm"
RPM_HASH = "f383a84f98e7fe765eb1b54136afa135b2844e6ccda3e3e9529c2f75861e462d2c6c0e50b7c6b5fd0b9f651134bd3080157d868bf724415949019d65b260535b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-ukrainian-doc"

RDEPENDS:${PN} += ""

inherit rpm
