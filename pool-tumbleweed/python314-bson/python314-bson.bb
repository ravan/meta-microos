SUMMARY = "BSON codec for Python"
DESCRIPTION = "BSON codec for Python."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.5.10"

RPM_NAME = "python314-bson-0.5.10-6.4.noarch.rpm"
RPM_HASH = "cd249dff9d94cf87fe759213568c61625e18bb0bb4e662a70c62f4cd78c9a61993bc41c9bc469022ea1819642cd08b8700bd429957e64cc79dcbee179ce15318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bson \
python314-bson \
python3dist-bson"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil"

inherit rpm
