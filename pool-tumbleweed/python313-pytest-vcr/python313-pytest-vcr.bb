SUMMARY = "Plugin for managing VCR.py cassettes"
DESCRIPTION = "Plugin for managing VCR.py cassettes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python313-pytest-vcr-1.0.2-3.5.noarch.rpm"
RPM_HASH = "89b0f5c32fe119b6323e186b447f977472fa514c7c905d8ddccaf56e1e151afa132a64327bacbf2fac266a2d6df3a825fd2f7b179c6e23fa681de62bde708c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-vcr \
python3.13dist-pytest-vcr \
python313-pytest-vcr \
python3dist-pytest-vcr"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-vcrpy"

inherit rpm
