SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "26.7.1"

RPM_NAME = "python314-autobahn-26.7.1-1.1.aarch64.rpm"
RPM_HASH = "793e02f2502e5fd777a0b36944340fca4f0d7c49ba7a7e328056922a4fb819f3644ec585c9cd13d1880aca91fb7f2e713577f9b33bbb3ccbe2a9ceb724f7a0f4"

RPROVIDES:${PN} += "python3.14dist-autobahn \
python314-autobahn \
python3dist-autobahn"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-cbor2 \
python314-cffi \
python314-cryptography \
python314-flatbuffers \
python314-hyperlink \
python314-msgpack \
python314-txaio \
python314-ujson \
update-alternatives"

inherit rpm
