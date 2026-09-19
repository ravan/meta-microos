SUMMARY = "Python wrapper around NXP LIBUSBSIO library"
DESCRIPTION = "Python wrapper around NXP LIBUSBSIO library"
LICENSE = "BSD-3-Clause"

PV = "2.1.11"

RPM_NAME = "python314-libusbsio-2.1.11-2.14.aarch64.rpm"
RPM_HASH = "c8eff0524eafd389628191f37afa009225f97be4eb9f1159813c06a8c46cc54f96f78e3e156cf1d5bd5e9df149e54d5e0bdb018d978c4f53cc079208b1185807"

RPROVIDES:${PN} += "libusbsio.so \
python3.14dist-libusbsio \
python314-libusbsio \
python3dist-libusbsio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
python-abi"

inherit rpm
