SUMMARY = "Decoder for ACM audio files"
DESCRIPTION = "Decoder library for InterPlay ACM audio files. \
ACM is a slightly compressed variant of PCM."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "libacm1-1.5-1.1.aarch64.rpm"
RPM_HASH = "96ecef05ffdfd12e5df6bd0ac72c85a24067fd05322d9cf59b0e52c6bb42718a306f6f40f4023f1fc3f7fed49aff4ff702f04d1275713d486695c82147102e49"

RPROVIDES:${PN} += "libacm.so.1 \
libacm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
