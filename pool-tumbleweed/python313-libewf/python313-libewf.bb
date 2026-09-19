SUMMARY = "Library for the Expert Witness Compression Format (EWF)"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20240506"

RPM_NAME = "python313-libewf-20240506-2.22.aarch64.rpm"
RPM_HASH = "c4f5b46cab76df3b9c5abe5cfb0384fc5087062e12c8cb7b163258300bbfb4733cd91c8fcd8bf28c1e1429e63cb8e6b579c5bfd98ef7df1db7c2a99e6c8996c9"

RPROVIDES:${PN} += "python3-libewf \
python313-libewf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libewf.so.3 \
python-abi"

inherit rpm
