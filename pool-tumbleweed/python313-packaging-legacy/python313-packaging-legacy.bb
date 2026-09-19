SUMMARY = "Core utilities for legacy Python packages"
DESCRIPTION = "Core utilities for legacy Python packages"
LICENSE = "Apache-2.0 | BSD-2-Clause"

PV = "23.0.post0"

RPM_NAME = "python313-packaging-legacy-23.0.post0-1.2.noarch.rpm"
RPM_HASH = "2c77dbbedc2aed27e35b5441c719f9359651e3e44f073e0bd94adea05bc6611009b44629f59698bb0b11e2c8611a7876cda9b951d83b2a355f6ada6c640cf6e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-packaging-legacy \
python3.13dist-packaging-legacy \
python313-packaging-legacy \
python3dist-packaging-legacy"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
