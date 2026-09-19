SUMMARY = "Documentation for texlive-ltxguidex"
DESCRIPTION = "This package includes the documentation for texlive-ltxguidex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn50992"

RPM_NAME = "texlive-ltxguidex-doc-2026.226.0.0.2.0svn50992-59.2.noarch.rpm"
RPM_HASH = "404ea4bfeb688887c2b98312fec14ecff124020576217b6306739fb44bbe2d43f11f507b3f5806fabd41392027286ffd8b4e689b9a58e6c75252edbc34c00ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxguidex-doc"

RDEPENDS:${PN} += ""

inherit rpm
