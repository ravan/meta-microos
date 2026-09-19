SUMMARY = "Documentation for texlive-crosswrd"
DESCRIPTION = "This package includes the documentation for texlive-crosswrd"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn16896"

RPM_NAME = "texlive-crosswrd-doc-2026.226.3.0svn16896-61.2.noarch.rpm"
RPM_HASH = "1f7a467a8eb358e3d8e26642416142bf59328100db8034394ccbd8c6c9cd545e7ac9cd1d22aa6b692cbb995cfa1a4c3c58117aa65e2241feb2d179bc250858a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crosswrd-doc"

RDEPENDS:${PN} += ""

inherit rpm
