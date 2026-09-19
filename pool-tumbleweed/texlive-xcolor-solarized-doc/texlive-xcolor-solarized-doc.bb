SUMMARY = "Documentation for texlive-xcolor-solarized"
DESCRIPTION = "This package includes the documentation for texlive-xcolor-solarized"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn61719"

RPM_NAME = "texlive-xcolor-solarized-doc-2026.226.0.0.4svn61719-59.4.noarch.rpm"
RPM_HASH = "d5af27de55c1f0f71e09597d63378d50e30eeda59810740f671819f907465daed3b806cddca589d19222e87dcd9d94c1568d4a8fc91494cd9510fa2a0cdf43e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-solarized-doc"

RDEPENDS:${PN} += ""

inherit rpm
