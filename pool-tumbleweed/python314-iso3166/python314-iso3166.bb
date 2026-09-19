SUMMARY = "Python ISO 3166-1 country definitions"
DESCRIPTION = "ISO 3166-1 defines two-letter, three-letter, and three-digit country \
codes. `python-iso3166` is a self-contained module that converts \
between these codes and the corresponding country name."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python314-iso3166-2.1.1-2.5.noarch.rpm"
RPM_HASH = "2ac5c8eeaa57174262cf9d4744de1f7f87d9c4ca362ad1bfe2b2ee4fcccc14ee7995eb00dd1408363c5741339cdb13fd3e21b903d963875f69c308318e08f82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-iso3166 \
python314-iso3166 \
python3dist-iso3166"

RDEPENDS:${PN} += "python-abi"

inherit rpm
