SUMMARY = "Documentation for texlive-initials"
DESCRIPTION = "This package includes the documentation for texlive-initials"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54080"

RPM_NAME = "texlive-initials-doc-2026.226.svn54080-60.2.noarch.rpm"
RPM_HASH = "5ba033c247086a1f85147e1458ae52e271568f96b73782755e25732f05a7cf75cf4adeb5451721b7e0cf5f0ba180759cfbe9242e7a13eade2ed656c15f20d961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-initials-doc"

RDEPENDS:${PN} += ""

inherit rpm
