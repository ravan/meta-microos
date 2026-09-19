SUMMARY = "Documentation for texlive-mathdesign"
DESCRIPTION = "This package includes the documentation for texlive-mathdesign"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.31svn31639"

RPM_NAME = "texlive-mathdesign-doc-2026.226.2.31svn31639-59.2.noarch.rpm"
RPM_HASH = "9a56b96b5411f6e2d4d8cbaefb381f6091d0eec7d33390ad85b32083100dfe853e8745ca093ff058c0d2036b661050b92a1207ad2c9a9e69776ea7c550549ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathdesign-doc"

RDEPENDS:${PN} += ""

inherit rpm
