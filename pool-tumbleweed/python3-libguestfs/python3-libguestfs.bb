SUMMARY = "Python 3 bindings for libguestfs"
DESCRIPTION = "python3-libguestfs contains Python 3 bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "python3-libguestfs-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "e18429f6ccb0a16a0706698896bf62262bd5d50733b664f0f0c50f608359f01ac1d351cdfab4c77cfe4557fe1d9c5b3d7943d3a0bfb974eef99295ab532625ea"

RPROVIDES:${PN} += "libguestfsmod.cpython-313-aarch64-linux-gnu.so \
python3-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
python-abi"

inherit rpm
