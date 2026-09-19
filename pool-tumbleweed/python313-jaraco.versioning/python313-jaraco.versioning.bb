SUMMARY = "More sophisticated version manipulation (than packaging)"
DESCRIPTION = "More sophisticated version manipulation (than packaging)"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-jaraco.versioning-1.1.0-4.2.noarch.rpm"
RPM_HASH = "3c043e225d05e2695935bedd24e39200659c898715cc920a5d96ea4243d1e07b920e547639a76b4a0412dc3af95da87ff50484f7c948204b733ce66fbb398574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.versioning \
python3.13dist-jaraco.versioning \
python313-jaraco.versioning \
python3dist-jaraco.versioning"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
