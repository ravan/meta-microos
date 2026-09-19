SUMMARY = "Documentation for texlive-prelim2e"
DESCRIPTION = "This package includes the documentation for texlive-prelim2e"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn77682"

RPM_NAME = "texlive-prelim2e-doc-2026.226.2.00svn77682-59.2.noarch.rpm"
RPM_HASH = "e712e939566abe284a7a36872f6573f3e0e5e3d0fdfb32b9c6b7608cce5bbf18336d71a9b9f0a403cdc3d297bf8087e35b430eb9739ea8c3e59bd6d367b9514a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prelim2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
