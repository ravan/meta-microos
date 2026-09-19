SUMMARY = "LSC Algorithm Burst Library"
DESCRIPTION = "The LSC Algorithm Burst Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "python313-lalburst-2.0.7-2.1.aarch64.rpm"
RPM_HASH = "e4b70da6ab158b835d9148948d8a8471ce61c1f6bd6b51f2d16a1b62731fe58cfcb326a5a75dd30cd2466598313de8c5bf4013dd5af3222ffd620f4d1980408f"

RPROVIDES:${PN} += "python3-lalburst \
python313-lalburst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalburst.so.8 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python313-glue \
python313-igwn-ligolw \
python313-igwn-segments \
python313-lal \
python313-lalmetaio \
python313-lalsimulation \
python313-ligo-lw \
python313-numpy \
python313-scipy"

inherit rpm
