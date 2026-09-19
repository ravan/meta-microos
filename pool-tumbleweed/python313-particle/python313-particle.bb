SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python313-particle-1.0.0-1.1.noarch.rpm"
RPM_HASH = "92a5800c689dd4808d6fa9b95cad27517c0961d5a8fba7f0242b27570009a5476e3beff085c35d907fbec0e0d5b76897d4688f48e110c5ab9720b3a3a6875811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-particle \
python3.13dist-particle \
python313-particle \
python3dist-particle"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-hepunits"

inherit rpm
