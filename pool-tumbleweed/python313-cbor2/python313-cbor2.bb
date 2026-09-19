SUMMARY = "Pure Python CBOR (de)serializer with extensive tag support"
DESCRIPTION = "Pure Python CBOR (de)serializer with extensive tag support"
LICENSE = "MIT"

PV = "5.9.0"

RPM_NAME = "python313-cbor2-5.9.0-1.5.aarch64.rpm"
RPM_HASH = "ff0928171205c688aea717d1a57a859605803fe6f38bda99722ae17039514a831e204f9e3ecfc1706322a1833635e81d94b7af79c1d8037f844a9b6a78aa99c1"

RPROVIDES:${PN} += "python3-cbor2 \
python3.13dist-cbor2 \
python313-cbor2 \
python3dist-cbor2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
