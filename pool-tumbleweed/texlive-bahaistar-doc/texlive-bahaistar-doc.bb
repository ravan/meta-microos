SUMMARY = "Documentation for texlive-bahaistar"
DESCRIPTION = "This package includes the documentation for texlive-bahaistar"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76351"

RPM_NAME = "texlive-bahaistar-doc-2026.226.0.0.1svn76351-60.2.noarch.rpm"
RPM_HASH = "021e2bd190c2d13f98d8990d7f6d7c4cb0f1ea758040293af231e399d46a55407dfeb54bf93196d1e7aa670c9eb0750c02e9db72c33a59a3f59dabf09565cbe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bahaistar-doc"

RDEPENDS:${PN} += ""

inherit rpm
