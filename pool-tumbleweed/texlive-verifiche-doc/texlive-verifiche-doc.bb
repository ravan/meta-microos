SUMMARY = "Documentation for texlive-verifiche"
DESCRIPTION = "This package includes the documentation for texlive-verifiche"
LICENSE = "LPPL-1.0"

PV = "2026.226.9.1svn77002"

RPM_NAME = "texlive-verifiche-doc-2026.226.9.1svn77002-60.2.noarch.rpm"
RPM_HASH = "57199cb52e1200c445ca674baccbaa5dd7e5fb718723ab8246a12329b7198c80b96b41fe117d997f37812adaf71581e2b1344571af923851ac666889353f8fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-verifiche-doc-it \
texlive-verifiche-doc"

RDEPENDS:${PN} += ""

inherit rpm
