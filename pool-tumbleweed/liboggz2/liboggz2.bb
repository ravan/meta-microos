SUMMARY = "Shared Libraries For Oggz"
DESCRIPTION = "liboggz is a library that provides simple parsing and seeking of \
files and streams based on the Ogg file format. liboggz requires \
libogg to work. \
liboggz knows about Ogg speex, Ogg vorbis, Ogg theora, and the Ogg \
based Annodex formats, thus allows parsing (though not decoding) of \
these files."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "liboggz2-1.1.3-2.4.aarch64.rpm"
RPM_HASH = "6e4716267415265e17805176e7424d0a70a129848fe72804b8074f0947b37f3313fcbfdec84d76a63eabb4309317d7c34d43ac36eb19e354059b158fb889d7bc"

RPROVIDES:${PN} += "liboggz.so.2 \
liboggz2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libogg.so.0"

inherit rpm
