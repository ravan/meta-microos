SUMMARY = "Documentation for texlive-xymtex"
DESCRIPTION = "This package includes the documentation for texlive-xymtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.06svn32182"

RPM_NAME = "texlive-xymtex-doc-2026.226.5.06svn32182-59.4.noarch.rpm"
RPM_HASH = "1c3f063301d937b8c2c5357613f8b62b8c11ffe5ae4fcf9e30ab1d0d49f3936bbff2c510dcac192f7be0953637913c590931430dfa659cb40d04ff26d049e766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xymtex-doc-ja \
texlive-xymtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
