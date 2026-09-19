SUMMARY = "Documentation for texlive-beamerthemeconcrete"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemeconcrete"
LICENSE = "LPPL-1.0"

PV = "2026.226.2024bsvn69528"

RPM_NAME = "texlive-beamerthemeconcrete-doc-2026.226.2024bsvn69528-61.2.noarch.rpm"
RPM_HASH = "912d1bf369ef3d30f63d15356b58c5456f9df27838aad30cdb49efda67b75665c7365fb3a65a90f06745f08088b737a193eb815e484e61c02e2d406cd0e9e5ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemeconcrete-doc"

RDEPENDS:${PN} += ""

inherit rpm
