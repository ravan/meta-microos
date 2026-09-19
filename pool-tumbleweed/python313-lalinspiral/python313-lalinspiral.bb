SUMMARY = "LSC Algorithm Inspiral Library"
DESCRIPTION = "The LSC Algorithm Inspiral Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.3"

RPM_NAME = "python313-lalinspiral-5.0.3-2.1.aarch64.rpm"
RPM_HASH = "2f419ddb8baec12a24d2ea5ea9590f0ee6aaaea8f5f9cc97a379cccf6f26855daaae3b3bfc0b2e6542a01aae9281c1fb978c639da0dd5dacd6ded8a5c8aab319"

RPROVIDES:${PN} += "python3-lalinspiral \
python313-lalinspiral"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalinspiral.so.18 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python313-glue \
python313-lal \
python313-lalburst \
python313-lalframe \
python313-lalmetaio \
python313-lalsimulation \
python313-numpy"

inherit rpm
