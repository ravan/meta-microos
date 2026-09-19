SUMMARY = "Documentation for texlive-ufrgscca"
DESCRIPTION = "This package includes the documentation for texlive-ufrgscca"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.13svn77050"

RPM_NAME = "texlive-ufrgscca-doc-2026.226.2.13svn77050-60.2.noarch.rpm"
RPM_HASH = "fcc62dd2388ae5a823766da354cb34bbef436b9f63f1e1b16b6ba1d8395d8682ca559f11c50dbd7a4688ef5e86781e5d80a9ec6031adc6bc9e2ebfe4d8d24116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ufrgscca-doc"

RDEPENDS:${PN} += ""

inherit rpm
