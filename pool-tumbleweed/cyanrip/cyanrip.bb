SUMMARY = "Bule-ish CD ripper"
DESCRIPTION = "Fully featured CD ripping program able to take out most of the tedium. Fully accurate, has advanced features most rippers don't, yet has no bloat and is cross-platform."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.3.1"

RPM_NAME = "cyanrip-0.9.3.1-1.12.aarch64.rpm"
RPM_HASH = "b46b1e2ec3abef155ee0c7137ba6aaff4be80ad52eb7b852e7bf334eca38a6457056fce8fc7866d056a4d51d5803a63cdef2ee204ca56c26ddae2159f536b380"

RPROVIDES:${PN} += "cyanrip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libcdio.so.19 \
libcurl.so.4 \
libm.so.6 \
libmusicbrainz5.so.1 \
libswresample.so.6"

inherit rpm
