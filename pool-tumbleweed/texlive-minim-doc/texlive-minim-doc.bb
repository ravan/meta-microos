SUMMARY = "Documentation for texlive-minim"
DESCRIPTION = "This package includes the documentation for texlive-minim"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_1.7svn73816"

RPM_NAME = "texlive-minim-doc-2026.226.2025_1.7svn73816-61.2.noarch.rpm"
RPM_HASH = "cd1acc0d982b2d7cceb7b2c0ae00c3d18b83f214a5783d2767313de9f60c972d63cd07a98f60e7c8f24e789ef37ffeddf74fcede02582f33207ca52c679183f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-doc"

RDEPENDS:${PN} += ""

inherit rpm
