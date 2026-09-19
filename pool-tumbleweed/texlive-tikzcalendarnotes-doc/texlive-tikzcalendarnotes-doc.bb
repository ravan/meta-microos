SUMMARY = "Documentation for texlive-tikzcalendarnotes"
DESCRIPTION = "This package includes the documentation for texlive-tikzcalendarnotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77050"

RPM_NAME = "texlive-tikzcalendarnotes-doc-2026.226.1.2svn77050-59.2.noarch.rpm"
RPM_HASH = "455aa774c54c6961c903f3f8c10f4d7c8c8f794a61d5195a0cf91092a34c727632e8340db440288cec84e2095ef721fa8a6e34c8dc1db24ff0c5b708cbcf129f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzcalendarnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
