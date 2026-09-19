SUMMARY = "A lightweight console printing and formatting toolkit"
DESCRIPTION = "A lightweight console printing and formatting toolkit."
LICENSE = "LGPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "python313-wasabi-1.1.3-1.9.noarch.rpm"
RPM_HASH = "f95bda865a8bf6a40ce76b133a479f343472cd7db250f59b9812b263a9b859c6bad49d91b8fdd911987bc8bcf9f641eb03cf51cce2b6d16440b1701cceab214a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wasabi \
python3.13dist-wasabi \
python313-wasabi \
python3dist-wasabi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
