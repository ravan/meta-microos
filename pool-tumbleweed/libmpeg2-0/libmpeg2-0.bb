SUMMARY = "MPEG-2 Video Stream Decoder"
DESCRIPTION = "libmpeg2 is a library for decoding MPEG-1 and MPEG-2 video streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libmpeg2-0-0.5.1-3.23.aarch64.rpm"
RPM_HASH = "e589f3e736136bd09ed252cc76a07e1119fceea5c85709af1324d4191ba8bba58bbd4cf7c81e70be5ef14d86ac3199ae3ddfbc7b2416090f70542412338fca7c"

RPROVIDES:${PN} += "libmpeg2-0 \
libmpeg2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
