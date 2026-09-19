SUMMARY = "A Python data validation library"
DESCRIPTION = "Voluptuous is a Python data validation library. It validates data \
coming into Python as JSON, YAML, etc."
LICENSE = "BSD-3-Clause"

PV = "0.16.0"

RPM_NAME = "python313-voluptuous-0.16.0-1.3.noarch.rpm"
RPM_HASH = "1f2e7367522536168aae2c5d0d007d39053170070964500dc3277a8db4b4d2d959c0d82b3178aa3e2c97f5faaaa788e8cd333bf01c79855eaaa55350cbacff91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-voluptuous \
python3.13dist-voluptuous \
python313-voluptuous \
python3dist-voluptuous"

RDEPENDS:${PN} += "python-abi"

inherit rpm
