SUMMARY = "Phabricator API Bindings"
DESCRIPTION = "Phabricator API Bindings"
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python313-phabricator-0.9.1-2.5.noarch.rpm"
RPM_HASH = "f8b6d7b667867d2b0e3fc6cdce7059bdabeba8ef3c7b68f875d0b330d285e3f8e4a5ae95f080b63e44dcae99fffd51e494e0158b67bb9fdb0f0c92d9626e485c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phabricator \
python3.13dist-phabricator \
python313-phabricator \
python3dist-phabricator"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
