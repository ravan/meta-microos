SUMMARY = "Documentation for texlive-plex-otf"
DESCRIPTION = "This package includes the documentation for texlive-plex-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11asvn77682"

RPM_NAME = "texlive-plex-otf-doc-2026.226.0.0.11asvn77682-59.2.noarch.rpm"
RPM_HASH = "ec164f55c1a9ca28d17ccdc5e1ab3774cab48522d03cc41a7bd4d7a83b605aefe6f3a188ff438604f94cedf275dae4032d88fcfa9dac870dc3130c69a7c52799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plex-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
