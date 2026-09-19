SUMMARY = "Documentation for texlive-termes-otf"
DESCRIPTION = "This package includes the documentation for texlive-termes-otf"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.02svn77682"

RPM_NAME = "texlive-termes-otf-doc-2026.227.0.0.02svn77682-62.2.noarch.rpm"
RPM_HASH = "cfc10371accb5459c2954e1f3172d6174f84422d064eb41234af11f3a16c740aabcdeaa11597f6d31ca4564b0f5c4a5f7bc764af26ad2aa3597901a940857c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termes-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
