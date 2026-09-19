SUMMARY = "Documentation for texlive-randtext"
DESCRIPTION = "This package includes the documentation for texlive-randtext"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-randtext-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "834d0a92b4311e1d9c7ed757ccab3b9d0b48e1ff614932b351c250b8c40e033433e18f1c56235d1b722f7ae79cf42f0403590e9de8df916fea47222fe94497c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
