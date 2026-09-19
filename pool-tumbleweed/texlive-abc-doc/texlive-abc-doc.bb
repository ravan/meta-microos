SUMMARY = "Documentation for texlive-abc"
DESCRIPTION = "This package includes the documentation for texlive-abc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn41157"

RPM_NAME = "texlive-abc-doc-2026.226.2.0bsvn41157-61.2.noarch.rpm"
RPM_HASH = "ad83ab86b12111ba91b38807a51abd137579b268f7dd46bf8de2b2ecef010cd89aabcd2d03bdecd98833e76d25a4de3ce765ee6dd53a95c4829c5b104995edce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abc-doc"

RDEPENDS:${PN} += ""

inherit rpm
