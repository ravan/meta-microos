SUMMARY = "Documentation for texlive-axodraw2"
DESCRIPTION = "This package includes the documentation for texlive-axodraw2"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1.1csvn77682"

RPM_NAME = "texlive-axodraw2-doc-2026.226.2.1.1csvn77682-60.2.noarch.rpm"
RPM_HASH = "b8b943b4c6d5bce9be72c830ec2d0ff27a66450554d0d4e2f75364b7ef9fa0f39e5a562148c6f53afe16f7c8e42a43ee6602086bcbcca9b076ef90be3431cf5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-axohelp.1 \
texlive-axodraw2-doc"

RDEPENDS:${PN} += ""

inherit rpm
