SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python314-particle-1.0.0-1.1.noarch.rpm"
RPM_HASH = "e798efca7ee5a6a1e1a5cce12014d75bf3f10f5794c473b939159372b0a62651a05c57a11079994e2cbf32532172345e31f4137a008ec9c9d8582632ae0fb74b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-particle \
python314-particle \
python3dist-particle"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-hepunits"

inherit rpm
