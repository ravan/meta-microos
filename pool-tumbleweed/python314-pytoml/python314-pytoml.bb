SUMMARY = "TOML-0.4.0 parser/writer for Python"
DESCRIPTION = "A specs-conforming and strict parser and writer for TOML files. \
The library currently supports version 0.4.0 of the specs. \
 \
The pytoml project is no longer being actively maintained. \
Consider using the toml package instead."
LICENSE = "MIT"

PV = "0.1.21"

RPM_NAME = "python314-pytoml-0.1.21-4.5.noarch.rpm"
RPM_HASH = "08fb9546a0c66e3468bb18cbab458c81066fa62a9004d9d38324df9b5231b1c424f62d98b3dadbfd2ead3f3eb3ec16f88b79f1af685c23f8a58733cce241147d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytoml \
python314-pytoml \
python3dist-pytoml"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
