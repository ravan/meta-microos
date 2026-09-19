SUMMARY = "Documentation for texlive-tikz-osci"
DESCRIPTION = "This package includes the documentation for texlive-tikz-osci"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.0svn68636"

RPM_NAME = "texlive-tikz-osci-doc-2026.226.0.0.4.0svn68636-59.2.noarch.rpm"
RPM_HASH = "77565d52cea6f6f2b924a706e75cf6676c8b546f41ec69471a2c412cda95cbb89ccae456ff583fc0899f168294b9a643440a8654d69fc1913b4543d97815c3c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-osci-doc"

RDEPENDS:${PN} += ""

inherit rpm
