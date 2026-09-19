SUMMARY = "Bindings for scrypt"
DESCRIPTION = "Bindings for the scrypt key derivation function library."
LICENSE = "BSD-2-Clause"

PV = "0.8.27"

RPM_NAME = "python314-scrypt-0.8.27-2.7.aarch64.rpm"
RPM_HASH = "88d906485e7db9b9fcd62e0430045b85e084cdd0a20c833e70b27b8df7b69b8fc75e9d9077ee1a7f2122bc7ad002cd889a1fdeab1e5d44b5c8901fbd375ed992"

RPROVIDES:${PN} += "python3.14dist-scrypt \
python314-scrypt \
python3dist-scrypt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
python-abi"

inherit rpm
