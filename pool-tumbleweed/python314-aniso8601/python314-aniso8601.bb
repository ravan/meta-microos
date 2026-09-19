SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "10.0.1"

RPM_NAME = "python314-aniso8601-10.0.1-1.5.noarch.rpm"
RPM_HASH = "06582f780b59464dfe3deeb9e3ee26a0fb24c948302754294e281a1d6619aea6dacbf35feadda0407ed7b7a66b949b22f807a578b3daac949c50e5c8441bf0aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aniso8601 \
python314-aniso8601 \
python3dist-aniso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
