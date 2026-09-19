SUMMARY = "Documentation for texlive-a0poster"
DESCRIPTION = "This package includes the documentation for texlive-a0poster"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.22bsvn54071"

RPM_NAME = "texlive-a0poster-doc-2026.226.1.22bsvn54071-61.2.noarch.rpm"
RPM_HASH = "855817e57b9a2f19a1cde4599fadbad6f3dbabb092b6f852f582948b6471dcdc322d8d653b3bf98b305277b74d89db013294f0a4e5ed810bb4effef6e2c05bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-a0poster-doc-de;en \
texlive-a0poster-doc"

RDEPENDS:${PN} += ""

inherit rpm
