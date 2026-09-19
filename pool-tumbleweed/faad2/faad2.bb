SUMMARY = "Freeware Advanced Audio (AAC) Decoder including SBR decoding"
DESCRIPTION = "FAAD2 is a HE, LC, MAIN and LTP profile, MPEG2 and MPEG-4 AAC decoder. \
FAAD2 includes code for SBR (HE AAC) decoding."
LICENSE = "GPL-2.0-or-later"

PV = "2.11.3"

RPM_NAME = "faad2-2.11.3-1.1.aarch64.rpm"
RPM_HASH = "064e70d86639f72833c61cb5caf1366de566723e564013c0a44324039ec9c511fce3f84ef459b0264caad6987acf4c8722c710a4f4ea4194d2d3353ff1be3831"

RPROVIDES:${PN} += "faad2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfaad.so.2 \
libfaad2 \
libm.so.6"

inherit rpm
