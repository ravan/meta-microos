SUMMARY = "Documentation for texlive-mfpic4ode"
DESCRIPTION = "This package includes the documentation for texlive-mfpic4ode"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn75712"

RPM_NAME = "texlive-mfpic4ode-doc-2026.226.0.0.4svn75712-61.2.noarch.rpm"
RPM_HASH = "83154afa2743f58c47b758890e393d5e95a57c71820b67ed60491e58b97e01d59d25e5c21a7e146e3a04125f2a90e9d98996380963adc9407c3b71d8329dcd32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfpic4ode-doc"

RDEPENDS:${PN} += ""

inherit rpm
