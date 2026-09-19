SUMMARY = "Coordination library for distributed systems"
DESCRIPTION = "The Tooz project aims at centralizing the most common distributed primitives \
like group membership protocol, lock service and leader election by providing \
a coordination API helping developers to build distributed applications."
LICENSE = "Apache-2.0"

PV = "9.1.0"

RPM_NAME = "python314-tooz-9.1.0-1.1.noarch.rpm"
RPM_HASH = "4337ac958a47575a11eeeb5588b24b60e9d0cb8fe9974843835b92fa741a6c0708609217b2c696d4c5447e0733417c295847e7d211dd4b8157f59d7968c1bf7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tooz \
python314-tooz \
python3dist-tooz"

RDEPENDS:${PN} += "python-abi \
python314-fasteners \
python314-futurist \
python314-msgpack \
python314-oslo.serialization \
python314-oslo.utils \
python314-stevedore \
python314-tenacity \
python314-voluptuous"

inherit rpm
