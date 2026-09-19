SUMMARY = "freealut is a free implementation of OpenAL's ALUT standard"
DESCRIPTION = "freealut is a free implementation of OpenAL's ALUT standard."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libalut0-1.1.0-237.29.aarch64.rpm"
RPM_HASH = "429541082daae5271177c2044ee38e7de8e36987ffce6ae05827c993edeb21ad2173fe0c58c491d16f83097c3438eff47272e4c0ead6bd83914a5c236c237c18"

RPROVIDES:${PN} += "libalut.so.0 \
libalut0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopenal.so.1"

inherit rpm
