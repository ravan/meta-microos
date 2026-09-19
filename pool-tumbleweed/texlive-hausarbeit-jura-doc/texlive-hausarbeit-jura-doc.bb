SUMMARY = "Documentation for texlive-hausarbeit-jura"
DESCRIPTION = "This package includes the documentation for texlive-hausarbeit-jura"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.0svn56070"

RPM_NAME = "texlive-hausarbeit-jura-doc-2026.226.2.1.0svn56070-60.4.noarch.rpm"
RPM_HASH = "94e95b02aa4aabf16de71c13994a6c4cf5a988670126e775cdbb731ddd228906a13ca1a233b50f68b475234b0b6e8c0aa9517f8c8855b00333c3e1d0c8f01a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hausarbeit-jura-doc-de \
texlive-hausarbeit-jura-doc"

RDEPENDS:${PN} += ""

inherit rpm
