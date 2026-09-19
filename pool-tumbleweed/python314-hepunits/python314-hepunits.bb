SUMMARY = "Units and constants in the HEP system of units"
DESCRIPTION = "hepunits collects the most commonly used units and constants in the HEP System \
of Units, as derived from the basic units originally defined by the CLHEP \
project."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "python314-hepunits-2.4.6-1.2.noarch.rpm"
RPM_HASH = "4c33b631453936a909f0dbb9da703242772a0f45ae58f2216c1011ade4b31aa12b4538d7acc0d4e315871d8d11210e1d7da1f2c73daee8a44f750b5f580f2049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hepunits \
python314-hepunits \
python3dist-hepunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
