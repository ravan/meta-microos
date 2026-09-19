SUMMARY = "Fast Base64 encoding/decoding"
DESCRIPTION = "pybase64 provides a fast Base64 implementation for Python using the SIMD \
(Single Instruction, Multiple Data) accelerated libbase64 C library. It \
exposes drop-in replacements for the standard library base64 encode and \
decode functions and ships a command line tool."
LICENSE = "BSD-2-Clause"

PV = "1.5.0"

RPM_NAME = "python313-pybase64-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "cf2df316d11e7baf53dc4441a820b28618258df225d024875d40ce388225d5b444a5defdc33062215480e14c93d4f005c0837546b91c7b6a8c33105e29e70125"

RPROVIDES:${PN} += "python3-pybase64 \
python3.13dist-pybase64 \
python313-pybase64 \
python3dist-pybase64"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
