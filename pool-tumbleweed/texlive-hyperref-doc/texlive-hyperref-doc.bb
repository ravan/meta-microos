SUMMARY = "Documentation for texlive-hyperref"
DESCRIPTION = "This package includes the documentation for texlive-hyperref"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.01psvn77682"

RPM_NAME = "texlive-hyperref-doc-2026.226.7.01psvn77682-60.2.noarch.rpm"
RPM_HASH = "5f989f521a4b58506a6e6e9622e2e8694136e36438e51ffb8ec19075ca9380c9e7eba957b1268b3024d5efe8c3d101e64f148909ed28de94c190f27f61ceface"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyperref-doc"

RDEPENDS:${PN} += ""

inherit rpm
