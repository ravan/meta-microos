SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "24.1.0"

RPM_NAME = "python314-environ-config-24.1.0-1.3.noarch.rpm"
RPM_HASH = "7b567995456d8b971a03ec35b85c5d1e15eac4dd09d766f382c626146bc0c5b8374719b1503e87f158f91e8fdd35b0b63dd79aab0ad1ccbdd81de8ba349cd72e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-environ-config \
python314-environ-config \
python3dist-environ-config"

RDEPENDS:${PN} += "python-abi \
python314-attrs"

inherit rpm
