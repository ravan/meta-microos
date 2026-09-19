SUMMARY = "Documentation for texlive-hep-math-font"
DESCRIPTION = "This package includes the documentation for texlive-hep-math-font"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-math-font-doc-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "4d43bf0e00a2a77ac21bf7ed25391b43699419ce4f451e1b066ab7ee56b7c511c5125e3b0385dea04fa84d95bf98dce17d191cecfebe01f6cab17f1f92b6d0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-math-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
