SUMMARY = "Documentation for texlive-feupphdteses"
DESCRIPTION = "This package includes the documentation for texlive-feupphdteses"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn30962"

RPM_NAME = "texlive-feupphdteses-doc-2026.226.4.0svn30962-59.2.noarch.rpm"
RPM_HASH = "4ef1a1a724243ab42b9993a835c5ac0cd93918ecab216333929140e0e39afd26c7948ce9a7c085b9e2d4f3fc5d5f928831697f37f24303661344c2812024cd11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feupphdteses-doc"

RDEPENDS:${PN} += ""

inherit rpm
