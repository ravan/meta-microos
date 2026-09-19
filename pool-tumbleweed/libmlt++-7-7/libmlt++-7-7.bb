SUMMARY = "C++ library API for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
This subpackage contains the C++ library API for MLT."
LICENSE = "GPL-3.0-or-later"

PV = "7.40.0"

RPM_NAME = "libmlt++-7-7-7.40.0-1.1.aarch64.rpm"
RPM_HASH = "9cd23805ad6f18ae171525517be2686c644903989740574da49f06c72634d6653a6fcd16bce644c12041f4dd6ac0dcf10a7cc11ebfa5f7f00ff10c210ba27cd4"

RPROVIDES:${PN} += "libmlt++-7-7 \
libmlt++-7.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmlt-7.so.7 \
libstdc++.so.6"

inherit rpm
