SUMMARY = "Library for Creating Font Specimen"
DESCRIPTION = "Library that allows to create specimens for installed \
font."
LICENSE = "GPL-2.0+"

PV = "20150202"

RPM_NAME = "libfont-specimen0-20150202-3.30.aarch64.rpm"
RPM_HASH = "3b0408878a8d3232bf369a67e820b9b1c6da33d59271941a77f4e164961bf7ce39ffcb54965dfd021b567ed17640b7753352ef7ca1a9bccf94053198b92c3d8c"

RPROVIDES:${PN} += "libfont-specimen.so.0 \
libfont-specimen0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libharfbuzz.so.0 \
libpng16.so.16"

inherit rpm
