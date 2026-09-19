SUMMARY = "Documentation for texlive-pxcjkcat"
DESCRIPTION = "This package includes the documentation for texlive-pxcjkcat"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-pxcjkcat-doc-2026.226.1.6svn77682-60.4.noarch.rpm"
RPM_HASH = "d67290939233624698d71838fad03f06489f13cbc42badaaf5b2e880d86c25b7193c5affa428ffecc7547efef61c1652587cf9b9837455e2b16f32c57a53e64c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxcjkcat-doc-ja;en \
texlive-pxcjkcat-doc"

RDEPENDS:${PN} += ""

inherit rpm
