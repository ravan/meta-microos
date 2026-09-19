SUMMARY = "Python binding for xxHash"
DESCRIPTION = "xxhash is a Python binding for the xxHash library."
LICENSE = "BSD-2-Clause"

PV = "3.8.0"

RPM_NAME = "python313-xxhash-3.8.0-1.3.aarch64.rpm"
RPM_HASH = "9b14448364aba980dddb41cb65c3224166aad1247554873251d259747926fcad5dae2cf01be1c033ebbfef292a3682b7837778673b0945eaea99f9cdf2e4e0d4"

RPROVIDES:${PN} += "python3-xxhash \
python3.13dist-xxhash \
python313-xxhash \
python3dist-xxhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxxhash.so.0 \
python-abi"

inherit rpm
