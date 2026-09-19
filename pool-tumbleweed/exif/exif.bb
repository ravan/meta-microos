SUMMARY = "Small Command Line Utility to Show and Change EXIF Information in JPEG Files"
DESCRIPTION = "Exif is a small command line utility to show and change EXIF \
information hidden in JPEG files. It demonstrate the power of libexif \
library."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.22"

RPM_NAME = "exif-0.6.22-3.9.aarch64.rpm"
RPM_HASH = "d44f5ae3b24e086fb0340a226df3c3235cd7a403959a1fe65198617afafadd63c5263dce28b9fdf7bcdaa6bcb99363540f72d2d4d3a3605abd1164283313cda4"

RPROVIDES:${PN} += "exif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexif.so.12 \
libpopt.so.0"

inherit rpm
