SUMMARY = "Documentation for texlive-babel-scottish"
DESCRIPTION = "This package includes the documentation for texlive-babel-scottish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0hsvn77682"

RPM_NAME = "texlive-babel-scottish-doc-2026.226.1.0hsvn77682-60.2.noarch.rpm"
RPM_HASH = "6650f6ad39e80f656af683376e9696ec189968b58915a70e7f1f1d0374bad95758547317350e4c090c51d7dd4ab2680a0d5cd49c2a321d13c5020408da71f8b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-scottish-doc"

RDEPENDS:${PN} += ""

inherit rpm
