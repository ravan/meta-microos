SUMMARY = "Library for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20240506"

RPM_NAME = "python314-libewf-20240506-2.22.aarch64.rpm"
RPM_HASH = "72cd1187f14406350f8cd21dbefd70d1cf5df9337dfa116b089c40d6afe7a2e79169565839b59c4d23a13249bb892668555c1794d3d0317e357d7a7dbf9dbd60"

RPROVIDES:${PN} += "python314-libewf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libewf.so.3 \
python-abi"

inherit rpm
