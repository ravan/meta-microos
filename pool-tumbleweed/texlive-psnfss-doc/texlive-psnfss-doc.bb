SUMMARY = "Documentation for texlive-psnfss"
DESCRIPTION = "This package includes the documentation for texlive-psnfss"
LICENSE = "LPPL-1.0"

PV = "2026.226.9.3svn77682"

RPM_NAME = "texlive-psnfss-doc-2026.226.9.3svn77682-59.2.noarch.rpm"
RPM_HASH = "0ea14a81f62b9adddc0f06cdbead9f843d6ad61140426926790beee214fba9098ba8d0314a199faf9484f0a1bda0428d66ce2681f9489beb32cbc4199ae51e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psnfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
