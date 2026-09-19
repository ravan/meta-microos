SUMMARY = "A Python data validation library"
DESCRIPTION = "Voluptuous is a Python data validation library. It validates data \
coming into Python as JSON, YAML, etc."
LICENSE = "BSD-3-Clause"

PV = "0.16.0"

RPM_NAME = "python314-voluptuous-0.16.0-1.3.noarch.rpm"
RPM_HASH = "2f10d163cc0d2174bb349ebe0074c104aada5763741368ffa477ec299102ab4a183f4eeacf44c167c63403b8a2660cc0488ca1f5c922ffd964cba90b57358de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-voluptuous \
python314-voluptuous \
python3dist-voluptuous"

RDEPENDS:${PN} += "python-abi"

inherit rpm
