SUMMARY = "Disassembler Library For x86/AMD64"
DESCRIPTION = "diStorm3 is a decomposer, which means it takes an instruction and \
returns a binary structure which describes it rather than static \
text."
LICENSE = "BSD-3-Clause"

PV = "3.5.2"

RPM_NAME = "python314-distorm3-3.5.2-2.7.aarch64.rpm"
RPM_HASH = "b465c7ce6c42983168f5a78d996a9f3354e7049c643dd1710b17018316a66e9e5aedc40859a71b038258dd7824a461fdf548738c43d4811c2ba1a2ee742baca9"

RPROVIDES:${PN} += "python3.14dist-distorm3 \
python314-distorm3 \
python3dist-distorm3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
