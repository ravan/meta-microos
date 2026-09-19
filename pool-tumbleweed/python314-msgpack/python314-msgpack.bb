SUMMARY = "MessagePack (de)serializer"
DESCRIPTION = "MessagePack (de)serializer for Python. \
 \
MessagePack is a binary-based efficient data interchange format that is \
focused on high performance. It is like JSON, but very fast and small."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python314-msgpack-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "d1fab933a4f34d36f7d99ffdb93f0658ae30d45710dd424ff47f87992ee86d2fbc75f895a92c18bbdf3579f3cce18f722fc3c321ee31d7a645f0b390f6929d99"

RPROVIDES:${PN} += "python3.14dist-msgpack \
python314-msgpack \
python314-msgpack-python \
python3dist-msgpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
