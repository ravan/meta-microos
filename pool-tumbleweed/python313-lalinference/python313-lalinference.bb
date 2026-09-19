SUMMARY = "LSC Algorithm Inference Library"
DESCRIPTION = "The LSC Algorithm Inference Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.9"

RPM_NAME = "python313-lalinference-4.1.9-3.1.aarch64.rpm"
RPM_HASH = "e031143721081af3b97d4cab60e8b0694c3086c3a73a579b7f9d8858b61b9fb0a547416fb09eb01a6aae441577a4fb4e49857f7e665cf424c705bd45d7e43e02"

RPROVIDES:${PN} += "python3-lalinference \
python313-lalinference"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalinference.so.23 \
liblalsupport.so.14 \
python-abi \
python313-igwn-ligolw \
python313-lal \
python313-lalburst \
python313-lalframe \
python313-lalinference-data \
python313-lalinspiral \
python313-lalmetaio \
python313-lalsimulation"

inherit rpm
