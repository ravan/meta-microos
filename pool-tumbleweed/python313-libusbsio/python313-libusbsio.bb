SUMMARY = "Python wrapper around NXP LIBUSBSIO library"
DESCRIPTION = "Python wrapper around NXP LIBUSBSIO library"
LICENSE = "BSD-3-Clause"

PV = "2.1.11"

RPM_NAME = "python313-libusbsio-2.1.11-2.14.aarch64.rpm"
RPM_HASH = "02fbbd1f59ca72651a32f9ee0f449f93e5be75507de21780729f5c0039f0cdd8cb6f4df4c52656373b3880b232f36ff24bc16e72eddd55022a5d3e0484810b5b"

RPROVIDES:${PN} += "libusbsio.so \
python3-libusbsio \
python3.13dist-libusbsio \
python313-libusbsio \
python3dist-libusbsio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
python-abi"

inherit rpm
