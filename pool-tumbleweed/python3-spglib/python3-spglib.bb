SUMMARY = "Python bindings for spglib/libsymspg"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python3-spglib-2.4.0-1.9.aarch64.rpm"
RPM_HASH = "ea8c44b82bf34d2a722b64b30f92a883e2d841562aeaba8c163141bf3c1ab18371a99f417024ecb0bbf2775150f05a56db8ee332959862839d47732f5190211f"

RPROVIDES:${PN} += "python3-spglib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsymspg.so.2 \
python-abi \
python3-numpy"

inherit rpm
