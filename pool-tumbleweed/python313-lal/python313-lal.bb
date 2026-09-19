SUMMARY = "A collection of various gravitational wave data analysis routines"
DESCRIPTION = "The LSC Algorithm Library Suite (LALSuite) is comprised of various \
gravitational wave data analysis routines written in C following the ISO/IEC \
9899:1999 standard."
LICENSE = "GPL-2.0-only"

PV = "7.7.0"

RPM_NAME = "python313-lal-7.7.0-4.1.aarch64.rpm"
RPM_HASH = "fe49c9d484c72eafa5faf55e9b2d60d0e62b83be1fb76f129971bee4758b69172ff4ea5004d5849e413be6a28355dc20365d1d5c7dcc9aa57f2db49f2928fb90"

RPROVIDES:${PN} += "python3-lal \
python313-lal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python313-freezegun \
python313-numpy \
python313-python-dateutil \
python313-scipy"

inherit rpm
