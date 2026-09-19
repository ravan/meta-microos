SUMMARY = "MessagePack (de)serializer"
DESCRIPTION = "MessagePack (de)serializer for Python. \
 \
MessagePack is a binary-based efficient data interchange format that is \
focused on high performance. It is like JSON, but very fast and small."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python313-msgpack-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "4b055e1f87728444ccb08e549a152a8806f89b394bdb49712acbba843c15bd52756ec4f4ffad969c258400f90903e10e82858d8e0392c756dbde29fb0a6b7f35"

RPROVIDES:${PN} += "python3-msgpack \
python3-msgpack-python \
python3.13dist-msgpack \
python313-msgpack \
python313-msgpack-python \
python3dist-msgpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
