SUMMARY = "Documentation for texlive-microtype"
DESCRIPTION = "This package includes the documentation for texlive-microtype"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2dsvn78228"

RPM_NAME = "texlive-microtype-doc-2026.226.3.2dsvn78228-61.2.noarch.rpm"
RPM_HASH = "c690c6433e9e5415bdd6bc6448fa452ec0e2a61dd40c734c907a41bb604d5726e2cdfeebd5232d81229d926ad3daa3d1f18d7f7b5cfdd768f32b958dd5fd38e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-microtype-doc"

RDEPENDS:${PN} += ""

inherit rpm
