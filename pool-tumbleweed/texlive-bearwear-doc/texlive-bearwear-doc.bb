SUMMARY = "Documentation for texlive-bearwear"
DESCRIPTION = "This package includes the documentation for texlive-bearwear"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn54826"

RPM_NAME = "texlive-bearwear-doc-2026.226.0.0.2svn54826-61.2.noarch.rpm"
RPM_HASH = "7990f04729535c900ecc198f148190a0e09b7a832e95643c47b2b4c800b9e3f549544c04beb77ad9e0f0683ff0a110c5879fd55d4bc3cb431779405641f434e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bearwear-doc"

RDEPENDS:${PN} += ""

inherit rpm
