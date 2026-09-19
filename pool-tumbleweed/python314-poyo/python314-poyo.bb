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

RPM_NAME = "python314-poyo-0.5.0-3.5.noarch.rpm"
RPM_HASH = "1ba50ef9722ba3ec1d7b887470a19241db4c8137d4d309c67caea81fa411376af0498dc3f70fb3db48f4298c9da75d2d4ef6b4edaca14f7a9f2785079e39a6ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-poyo \
python314-poyo \
python3dist-poyo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
