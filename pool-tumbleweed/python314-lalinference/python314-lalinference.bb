SUMMARY = "LSC Algorithm Inference Library"
DESCRIPTION = "The LSC Algorithm Inference Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.9"

RPM_NAME = "python314-lalinference-4.1.9-3.1.aarch64.rpm"
RPM_HASH = "b4c8d3db536264967bb24f410bff23dcc9998be46065a7f4fdec4a308ad9fb6d818221bf2496e4e2ef51b1a5e12109780afbbbe7c283793808cfe3144fe2b8d0"

RPROVIDES:${PN} += "python314-lalinference"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalinference.so.23 \
liblalsupport.so.14 \
python-abi \
python314-igwn-ligolw \
python314-lal \
python314-lalburst \
python314-lalframe \
python314-lalinference-data \
python314-lalinspiral \
python314-lalmetaio \
python314-lalsimulation"

inherit rpm
