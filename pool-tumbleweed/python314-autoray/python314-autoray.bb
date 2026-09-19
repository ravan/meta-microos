SUMMARY = "A lightweight python automatic-array library"
DESCRIPTION = "Write backend agnostic numeric code compatible with any numpy-ish array library."
LICENSE = "Apache-2.0"

PV = "0.8.11"

RPM_NAME = "python314-autoray-0.8.11-1.3.noarch.rpm"
RPM_HASH = "d7e96d3b79d3ddba321ebf8de04e6af11b6310ab40522240bebec432205aa0014f0b4e1c5e09474d09b5064938c4e3214d3b4d1265c22394f63982168335c45d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-autoray \
python314-autoray \
python3dist-autoray"

RDEPENDS:${PN} += "python-abi"

inherit rpm
