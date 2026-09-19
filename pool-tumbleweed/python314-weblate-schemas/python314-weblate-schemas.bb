SUMMARY = "A collection of schemas used by Weblate"
DESCRIPTION = "This module contains schemas used in Weblate exports."
LICENSE = "MIT"

PV = "2025.6"

RPM_NAME = "python314-weblate-schemas-2025.6-1.4.noarch.rpm"
RPM_HASH = "94da7a51c1567d84504c0bce16f3821ce82ac60bd8fa3c5f54e51f282b649b539c7fe4734145ee4817c93fbc742c5ec818bb7601dc7fca9c657196ecfabb3612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-weblate-schemas \
python314-weblate-schemas \
python3dist-weblate-schemas"

RDEPENDS:${PN} += "python-abi \
python314-jsonschema \
python314-jsonschema-format"

inherit rpm
