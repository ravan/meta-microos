SUMMARY = "Documentation for texlive-dtxgen"
DESCRIPTION = "This package includes the documentation for texlive-dtxgen"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.09svn75946"

RPM_NAME = "texlive-dtxgen-doc-2026.226.1.09svn75946-59.2.noarch.rpm"
RPM_HASH = "d153b11f490804cd85cb09d2f96ea2d104c41a463ed32dd2bc246ac4dffaddaf7e11c732352250b3da3c3a81a1620d8f0401fcc8672d6cca1f7da18d1a346878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dtxgen.1 \
texlive-dtxgen-doc"

RDEPENDS:${PN} += ""

inherit rpm
