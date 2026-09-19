SUMMARY = "Documentation for texlive-biblatex-cv"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-cv"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn59433"

RPM_NAME = "texlive-biblatex-cv-doc-2026.226.0.0.01svn59433-61.2.noarch.rpm"
RPM_HASH = "524b0ea2f3c92cc00e0e19813bbc19aefcfe27e10309d22b33d98c384b0d18121896ddd895ef1e32c713ca0a5a968fad5dd441e6fb6f554cd75e58f7108c99ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
