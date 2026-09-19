SUMMARY = "Documentation for texlive-romanbarpagenumber"
DESCRIPTION = "This package includes the documentation for texlive-romanbarpagenumber"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36236"

RPM_NAME = "texlive-romanbarpagenumber-doc-2026.226.1.0svn36236-60.2.noarch.rpm"
RPM_HASH = "06f8f112ff75821a3470ab446972a00a49197b2705a9335c59a6801d612a0f1eb5a3a0165167e13955e360155da2516a449d39a32bd1d1e67103b3a937a0d393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romanbarpagenumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
