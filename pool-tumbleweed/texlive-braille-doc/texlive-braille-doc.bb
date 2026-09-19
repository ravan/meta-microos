SUMMARY = "Documentation for texlive-braille"
DESCRIPTION = "This package includes the documentation for texlive-braille"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20655"

RPM_NAME = "texlive-braille-doc-2026.226.svn20655-59.2.noarch.rpm"
RPM_HASH = "dfc1b9319ea6d2241756e157ce2f675c7603973b7e42dfab4a563e3f9a42c138f5df3bfc4953027247da6017f7009923e7e5c4cb5322621ab1600f66d96cf47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-braille-doc"

RDEPENDS:${PN} += ""

inherit rpm
