SUMMARY = "Documentation for texlive-polexpr"
DESCRIPTION = "This package includes the documentation for texlive-polexpr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.7asvn77682"

RPM_NAME = "texlive-polexpr-doc-2026.226.0.0.8.7asvn77682-59.2.noarch.rpm"
RPM_HASH = "566d469157f25910ba001604ab7a8d592df11f6f6fce1356d97b6b92cd58eadbd6a36d154775304f2e7511b3c36aea22550dca388591a83de7f351da8feb6681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polexpr-doc"

RDEPENDS:${PN} += ""

inherit rpm
