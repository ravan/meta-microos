SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "python314-PyNaCl-1.6.2-1.6.aarch64.rpm"
RPM_HASH = "b39421f06a2e635330fd589bac28add22aa36f4e32c03c357428dd72f7a47b79d15af47c0ce8d95472ceeae64025c28a6aaf6a49f530131df7de5d086f0009ba"

RPROVIDES:${PN} += "python3.14dist-pynacl \
python314-PyNaCl \
python3dist-pynacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.26 \
python-abi \
python314-cffi"

inherit rpm
