SUMMARY = "GAP: Gauss Functionality for homalg"
DESCRIPTION = "The GaussForHomalg package links the homalg package together with the \
Gauss package."
LICENSE = "GPL-2.0-only"

PV = "2026.04.01"

RPM_NAME = "gap-gaussforhomalg-2026.04.01-1.2.noarch.rpm"
RPM_HASH = "a1d98be58f8de2ed4c64fe0ff21aa33a7b8e924ca9a83b51dcb1a3914ee222a01c4d670092aaf06e6441445fdd6bd9e1f5784e8e05922b2e75e49b7b1b6a2239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-gaussforhomalg"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-gauss \
gap-matricesforhomalg \
gap-toolsforhomalg"

inherit rpm
