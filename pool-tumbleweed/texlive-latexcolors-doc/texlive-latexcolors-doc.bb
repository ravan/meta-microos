SUMMARY = "Documentation for texlive-latexcolors"
DESCRIPTION = "This package includes the documentation for texlive-latexcolors"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn49888"

RPM_NAME = "texlive-latexcolors-doc-2026.226.0.0.1asvn49888-61.2.noarch.rpm"
RPM_HASH = "1655ce63e8b785daf3c35c89cafca9deec3feeb5b5640284e576b26d2d32fce17153639332a3e4df8b36efeef41d3e90f407cbbf52e34dccbb1779c69ebfb399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
