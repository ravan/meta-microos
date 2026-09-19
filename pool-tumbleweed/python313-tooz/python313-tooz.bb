SUMMARY = "Coordination library for distributed systems"
DESCRIPTION = "The Tooz project aims at centralizing the most common distributed primitives \
like group membership protocol, lock service and leader election by providing \
a coordination API helping developers to build distributed applications."
LICENSE = "Apache-2.0"

PV = "9.1.0"

RPM_NAME = "python313-tooz-9.1.0-1.1.noarch.rpm"
RPM_HASH = "36285a7a67f74be099272a2f5898718beed9d911e1d7acb17d45243da9896980cb6612a65754c2c8bb3929aafe69199b4cdde4c8f14aa5aa72b0170bbbb4b14d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tooz \
python3.13dist-tooz \
python313-tooz \
python3dist-tooz"

RDEPENDS:${PN} += "python-abi \
python313-fasteners \
python313-futurist \
python313-msgpack \
python313-oslo.serialization \
python313-oslo.utils \
python313-stevedore \
python313-tenacity \
python313-voluptuous"

inherit rpm
