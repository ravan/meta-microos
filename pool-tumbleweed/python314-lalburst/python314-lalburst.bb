SUMMARY = "LSC Algorithm Burst Library"
DESCRIPTION = "The LSC Algorithm Burst Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "python314-lalburst-2.0.7-2.1.aarch64.rpm"
RPM_HASH = "c49051607082e21cd0869b2fd6c6228423bcbf3eac0ae58ea3c0c83fd74015aefbdd9b7c65688da548d8dcbfa64d9d65be3b98a4d999c02d4aa65defec171d2e"

RPROVIDES:${PN} += "python314-lalburst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalburst.so.8 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python314-glue \
python314-igwn-ligolw \
python314-igwn-segments \
python314-lal \
python314-lalmetaio \
python314-lalsimulation \
python314-ligo-lw \
python314-numpy \
python314-scipy"

inherit rpm
