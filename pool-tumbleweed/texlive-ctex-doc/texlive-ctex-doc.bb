SUMMARY = "Documentation for texlive-ctex"
DESCRIPTION = "This package includes the documentation for texlive-ctex"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5.10svn77682"

RPM_NAME = "texlive-ctex-doc-2026.226.2.5.10svn77682-61.2.noarch.rpm"
RPM_HASH = "46ab4cff4797fb110b32223a51e61f319a02aafe0bd62b6b56cd84eb222dfb3623c229a60556679a1276e02506b1582de625487e62d295bec3dcb9b04fa5112c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ctex-doc-zh \
texlive-ctex-doc"

RDEPENDS:${PN} += ""

inherit rpm
