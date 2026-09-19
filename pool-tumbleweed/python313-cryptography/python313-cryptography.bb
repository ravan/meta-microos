SUMMARY = "Python library which exposes cryptographic recipes and primitives"
DESCRIPTION = "cryptography includes both high level recipes, and low \
level interfaces to common cryptographic algorithms such as \
symmetric ciphers, message digests and key derivation \
functions."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "50.0.0"

RPM_NAME = "python313-cryptography-50.0.0-1.2.aarch64.rpm"
RPM_HASH = "f4958d914bd0bcbb4353fcf952159fd051908f9751248886557448be1e4131db0c013c1f7632c90be9f364c67122cd0e7a11720cfb2c8e93963470c158fef5eb"

RPROVIDES:${PN} += "python3-cryptography \
python3.13dist-cryptography \
python313-cryptography \
python3dist-cryptography"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
python-abi \
python313 \
python313-bcrypt \
python313-cffi"

inherit rpm
