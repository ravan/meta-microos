SUMMARY = "Python library which exposes cryptographic recipes and primitives"
DESCRIPTION = "cryptography includes both high level recipes, and low \
level interfaces to common cryptographic algorithms such as \
symmetric ciphers, message digests and key derivation \
functions."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "50.0.0"

RPM_NAME = "python314-cryptography-50.0.0-1.2.aarch64.rpm"
RPM_HASH = "906954e7e3258535d8104d608378e796bd991343f593ca1d5f4918a34ff0eb5f15b79ecb2641517488f21082ba761931a08d459b1a7fd2ccd38c868712fc57a8"

RPROVIDES:${PN} += "python3.14dist-cryptography \
python314-cryptography \
python3dist-cryptography"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
python-abi \
python314 \
python314-bcrypt \
python314-cffi"

inherit rpm
