SUMMARY = "Documentation for texlive-zxjafont"
DESCRIPTION = "This package includes the documentation for texlive-zxjafont"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-zxjafont-doc-2026.226.1.3svn77682-59.4.noarch.rpm"
RPM_HASH = "6beb0e584bc480b279c1eea8e2c3958a166e02805b203ee1863e7a3b46d8a142afce6cf26e73b2118549ec932f8ea9346742bd6386a7107302d6a0b5a3c006fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zxjafont-doc-ja;en \
texlive-zxjafont-doc"

RDEPENDS:${PN} += ""

inherit rpm
