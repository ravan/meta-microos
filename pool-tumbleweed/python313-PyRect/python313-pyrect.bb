SUMMARY = "Rect class for Pygame-like rectangular areas"
DESCRIPTION = "PyRect is a simple module with a Rect class for Pygame-like rectangular areas."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python313-PyRect-0.2.0-2.5.noarch.rpm"
RPM_HASH = "b161a7640e9d9e56ae800cfc8f201a8b50070c850418d269f42b0718bc9700c5eac5593eda39af5ba693e30aaedf260d10ac777dab0c1c5a3c7cc97dd5dcfbfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyRect \
python3.13dist-pyrect \
python313-PyRect \
python3dist-pyrect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
