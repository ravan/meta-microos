SUMMARY = "Pure Python CBOR (de)serializer with extensive tag support"
DESCRIPTION = "Pure Python CBOR (de)serializer with extensive tag support"
LICENSE = "MIT"

PV = "5.9.0"

RPM_NAME = "python314-cbor2-5.9.0-1.5.aarch64.rpm"
RPM_HASH = "77a2964c80ab5b4caf02def010c2737bcab62bba7ea7858e60850929d99dde08810092f38f47d1cc9cdbf13d8de39f2947c5a3e167c61a9fc98cf82181d30c17"

RPROVIDES:${PN} += "python3.14dist-cbor2 \
python314-cbor2 \
python3dist-cbor2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
