SUMMARY = "Documentation for texlive-datetime2-english"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-english"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn52479"

RPM_NAME = "texlive-datetime2-english-doc-2026.226.1.05svn52479-59.2.noarch.rpm"
RPM_HASH = "4b0a4cfd797e5f194a6ac35091edd6d0a1a46a2f45ae208207c934b4059a253475bb196bd9eda55114c113e1c3b00dd09e9e45336acf967ccbe0b5db46b75804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-english-doc"

RDEPENDS:${PN} += ""

inherit rpm
