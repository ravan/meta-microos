SUMMARY = "Documentation for texlive-mathspec"
DESCRIPTION = "This package includes the documentation for texlive-mathspec"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2bsvn77682"

RPM_NAME = "texlive-mathspec-doc-2026.226.0.0.2bsvn77682-59.2.noarch.rpm"
RPM_HASH = "0653d93a2401c5ddbb39dd7f3a64e3b16e7c169b8ac5fb4fa131d285c23dda774832c9ec1203f16994a9f9d85f0019a56544f4b962dfab104eacf96862e77bd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathspec-doc"

RDEPENDS:${PN} += ""

inherit rpm
