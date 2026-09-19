SUMMARY = "Documentation for texlive-tensind"
DESCRIPTION = "This package includes the documentation for texlive-tensind"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn77682"

RPM_NAME = "texlive-tensind-doc-2026.227.1.1svn77682-62.2.noarch.rpm"
RPM_HASH = "ed9779c1a2a2ca547089c8a758364727e0d4f5ca5f9ca20295e39dd580a2166138c9e354f5ce3b92242ddd7a4e00deb49820dcb90cb7983caddd035cae78e19f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tensind-doc"

RDEPENDS:${PN} += ""

inherit rpm
