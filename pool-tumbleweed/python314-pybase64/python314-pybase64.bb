SUMMARY = "Fast Base64 encoding/decoding"
DESCRIPTION = "pybase64 provides a fast Base64 implementation for Python using the SIMD \
(Single Instruction, Multiple Data) accelerated libbase64 C library. It \
exposes drop-in replacements for the standard library base64 encode and \
decode functions and ships a command line tool."
LICENSE = "BSD-2-Clause"

PV = "1.5.0"

RPM_NAME = "python314-pybase64-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "d78f106483103abb24d7111894e1ff77a57aedba8fd1a823fc4a9e9c48bd75ce210ffc24827499346f41d5c0b1bf5fe55f3713730f13cd0f9756ec7e5e6f647f"

RPROVIDES:${PN} += "python3.14dist-pybase64 \
python314-pybase64 \
python3dist-pybase64"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
