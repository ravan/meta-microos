SUMMARY = "Full featured consistent hashing python library compatible with ketama"
DESCRIPTION = "Full featured consistent hashing python library compatible with ketama."
LICENSE = "BSD-3-Clause"

PV = "2.5"

RPM_NAME = "python313-uhashring-2.5-1.1.noarch.rpm"
RPM_HASH = "fd369706e4fc1adf1312ad9c435238ada072653dcb9ef6f55b966ec7b55d44e9332e41d06acf0d2c1becbf4d95157c0dce2e0b3a2de0f128378da0bcb8f5a4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uhashring \
python3.13dist-uhashring \
python313-uhashring \
python3dist-uhashring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
