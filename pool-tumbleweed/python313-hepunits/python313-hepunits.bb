SUMMARY = "Units and constants in the HEP system of units"
DESCRIPTION = "hepunits collects the most commonly used units and constants in the HEP System \
of Units, as derived from the basic units originally defined by the CLHEP \
project."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "python313-hepunits-2.4.6-1.2.noarch.rpm"
RPM_HASH = "672d89f30f360a95345b6fdf23416f8f499963b96ca483503edfce14edbc22896e20741341cc8a3bd9e244af3fbefc07b167d368af2b5c1eef203d372187fec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hepunits \
python3.13dist-hepunits \
python313-hepunits \
python3dist-hepunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
