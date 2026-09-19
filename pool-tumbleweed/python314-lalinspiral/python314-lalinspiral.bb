SUMMARY = "LSC Algorithm Inspiral Library"
DESCRIPTION = "The LSC Algorithm Inspiral Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.3"

RPM_NAME = "python314-lalinspiral-5.0.3-2.1.aarch64.rpm"
RPM_HASH = "7cb13e97c76b2c8de61f8d6a6da64daee95c595511053deae36feda439adf384af1dec8542512b221803658fc817d109c5d4ec40d42191a9c4360b1cefe95b09"

RPROVIDES:${PN} += "python314-lalinspiral"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalinspiral.so.18 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python314-glue \
python314-lal \
python314-lalburst \
python314-lalframe \
python314-lalmetaio \
python314-lalsimulation \
python314-numpy"

inherit rpm
