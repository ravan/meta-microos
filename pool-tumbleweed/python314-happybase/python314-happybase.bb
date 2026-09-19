SUMMARY = "A Python library to interact with Apache HBase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-happybase-1.3.0-1.2.noarch.rpm"
RPM_HASH = "aa685ce1ebc61eb876098bb31b139148a374f66c76764b5ff0009bc164aa418b9d505e3619490eda7205108891b22c0bdd252a2a34a214e7a6f3a4b98d942eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-happybase \
python314-happybase \
python3dist-happybase"

RDEPENDS:${PN} += "python-abi \
python314-importlib-resources \
python314-six \
python314-thriftpy2"

inherit rpm
