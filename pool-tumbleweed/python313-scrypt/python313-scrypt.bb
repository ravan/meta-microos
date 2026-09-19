SUMMARY = "Bindings for scrypt"
DESCRIPTION = "Bindings for the scrypt key derivation function library."
LICENSE = "BSD-2-Clause"

PV = "0.8.27"

RPM_NAME = "python313-scrypt-0.8.27-2.7.aarch64.rpm"
RPM_HASH = "6cd9946d5bc7e5b0614acd7c45f64b12c357bb3a5d4ff9851269b3084bae1957f4c1d900b2e0e061030d170918f827f58ed428b8ab29243eeffb94b3342598a4"

RPROVIDES:${PN} += "python3-scrypt \
python3.13dist-scrypt \
python313-scrypt \
python3dist-scrypt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
python-abi"

inherit rpm
