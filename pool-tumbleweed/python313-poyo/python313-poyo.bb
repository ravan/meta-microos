SUMMARY = "YAML Parser for Python"
DESCRIPTION = "A YAML Parser for Python. \
 \
Please note that Poyo supports only a chosen subset of the YAML format. \
 \
It can only read but not write and is not compatible with JSON. \
 \
Poyo does not allow deserialization of arbitrary Python objects. Supported \
types are str, bool, int, float, NoneType as well as dict and list values."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-poyo-0.5.0-3.5.noarch.rpm"
RPM_HASH = "86b0397183252ece4c474c6d235971de5a6f7be89f6c16c106d0c16b4c21cc1aa3057074fb89ac846b754a26377b92149e93cc4bb58a65c9c3386390b479c097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poyo \
python3.13dist-poyo \
python313-poyo \
python3dist-poyo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
