SUMMARY = "A collection of various gravitational wave data analysis routines"
DESCRIPTION = "The LSC Algorithm Library Suite (LALSuite) is comprised of various \
gravitational wave data analysis routines written in C following the ISO/IEC \
9899:1999 standard."
LICENSE = "GPL-2.0-only"

PV = "7.7.0"

RPM_NAME = "python314-lal-7.7.0-4.1.aarch64.rpm"
RPM_HASH = "2acdd3d822d37bca9555ec5105a2bc4af5a879629d211e9dd71ed280b30abb24c83b8240f527292a12bd5d54b25fa6b261d8cabf09287b5998aba6a9c99088f8"

RPROVIDES:${PN} += "python314-lal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python314-freezegun \
python314-numpy \
python314-python-dateutil \
python314-scipy"

inherit rpm
