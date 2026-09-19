SUMMARY = "Documentation for texlive-pxfonts"
DESCRIPTION = "This package includes the documentation for texlive-pxfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-pxfonts-doc-2026.226.svn77682-60.4.noarch.rpm"
RPM_HASH = "41821c16fcc378dbc11085a8c92922d37b06843e2e0865d8eccc2351a6cc06c9e17805e6db0b3af2d86c686e7116057fd33430a16c41eed6bad95bd51ee39d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
