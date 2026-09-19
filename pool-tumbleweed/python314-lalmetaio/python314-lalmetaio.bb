SUMMARY = "LSC Algorithm MetaIO Library"
DESCRIPTION = "The LSC Algorithm MetaIO Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.6"

RPM_NAME = "python314-lalmetaio-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "4fdf1287664848dc778aef817c6e689f71d733b0e8f8553b16d6a20f13e5a5a661510b575cfd0574443f16afe3ba6c73382aedb291f41f7427cc0901a9b09192"

RPROVIDES:${PN} += "python314-lalmetaio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalmetaio.so.11 \
liblalsupport.so.14 \
python-abi \
python314-lal \
python314-numpy"

inherit rpm
