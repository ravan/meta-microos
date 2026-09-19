SUMMARY = "Documentation for texlive-gammas"
DESCRIPTION = "This package includes the documentation for texlive-gammas"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn56403"

RPM_NAME = "texlive-gammas-doc-2026.226.1.1svn56403-60.2.noarch.rpm"
RPM_HASH = "ef02ed382aa0a1a6e5bc1a9efcca9bb1d8eba994ac3a8c1951dc87f3f353089b050fbd899621f864636ccdcc413b7045e6be232e731d11bd1e722d44e14ce7a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gammas-doc"

RDEPENDS:${PN} += ""

inherit rpm
