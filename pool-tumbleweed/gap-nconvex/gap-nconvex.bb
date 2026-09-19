SUMMARY = "GAP: Polyhedral computations"
DESCRIPTION = "The NConvex package is a GAP package. Its aim is to carry out \
polyhedral constructions and computations, namely computing \
properties and attributes of cones, polyhedrons, polytopes and fans."
LICENSE = "GPL-2.0-or-later"

PV = "2025.12.02"

RPM_NAME = "gap-nconvex-2025.12.02-1.2.aarch64.rpm"
RPM_HASH = "b6294025bde2331e3e98235059a0221d3e65b8b0a11d6afadb2cda993fb5549e79937ffc842f35f9ba38b431d3577602dece70092034d1a8e63cb308622b71f8"

RPROVIDES:${PN} += "gap-nconvex"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-autodoc \
gap-cddinterface \
gap-core \
gap-modules \
gap-normalizinterface"

inherit rpm
