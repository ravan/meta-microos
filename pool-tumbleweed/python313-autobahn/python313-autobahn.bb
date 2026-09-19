SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "26.7.1"

RPM_NAME = "python313-autobahn-26.7.1-1.1.aarch64.rpm"
RPM_HASH = "0c881bc850e618eff095a801d8dd68c11f0d5e0ee675d8447cd9801e667b63add01b7f7d7f90414dc01b24f76ae5b84681ae2c0d7b0d9e60362b195695e6c1aa"

RPROVIDES:${PN} += "python3-autobahn \
python3.13dist-autobahn \
python313-autobahn \
python3dist-autobahn"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-cbor2 \
python313-cffi \
python313-cryptography \
python313-flatbuffers \
python313-hyperlink \
python313-msgpack \
python313-txaio \
python313-ujson \
update-alternatives"

inherit rpm
