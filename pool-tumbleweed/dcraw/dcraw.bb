SUMMARY = "Raw Digital Photo Decoding"
DESCRIPTION = "Command line tools for raw digital photo decoding and processing."
LICENSE = "GPL-2.0-or-later"

PV = "9.28.0"

RPM_NAME = "dcraw-9.28.0-5.10.aarch64.rpm"
RPM_HASH = "c34fc039e59d1d85cec9c81b2a38b96e674da0fb5e9fa7be510c58e0c6b0ccdcbe6ba275bf43373c48ced239b6cb05f4066ab225a2f01a700a7fefef8e796e37"

RPROVIDES:${PN} += "dcraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjasper.so.7 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6"

inherit rpm
