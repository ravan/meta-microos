SUMMARY = "PAM interface using ctypes"
DESCRIPTION = "PAM interface using ctypes."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-pamela-1.2.0-2.5.noarch.rpm"
RPM_HASH = "6c29d084461fe65fa0b275bf4587446275f8dc3dcbb541ca965b5d2dc61ce8de020953886975f47853d3ca23b88f27b1c2bde4c352dbefe44674439211d7dd5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pamela \
python3.13dist-pamela \
python313-pamela \
python3dist-pamela"

RDEPENDS:${PN} += "python-abi"

inherit rpm
