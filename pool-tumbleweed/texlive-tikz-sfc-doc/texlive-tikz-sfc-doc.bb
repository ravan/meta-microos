SUMMARY = "Documentation for texlive-tikz-sfc"
DESCRIPTION = "This package includes the documentation for texlive-tikz-sfc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn49424"

RPM_NAME = "texlive-tikz-sfc-doc-2026.226.1.0.1svn49424-59.2.noarch.rpm"
RPM_HASH = "e346aa7a14c68357d1944a684feb209269d892e8143eec9b47bab0dd11c96322bc66e561c54867cdf46a55a2b24076b57049d7493af3194133c64a8c8c3b7934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-sfc-doc"

RDEPENDS:${PN} += ""

inherit rpm
