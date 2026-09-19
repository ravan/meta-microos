SUMMARY = "authres - Authentication Results Header Module"
DESCRIPTION = "authres - Authentication Results Header Module"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python314-authres-1.2.0-3.5.noarch.rpm"
RPM_HASH = "3deb8ad3b64e6cbe95f3f07c8adf55311e6cdeba2a052f3c32fd9c940c36d85b7f7a24d4ef1d963e4273e98e537df28d3f6b3d98781e07c98aec11d937b185da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-authres \
python314-authres \
python3dist-authres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
