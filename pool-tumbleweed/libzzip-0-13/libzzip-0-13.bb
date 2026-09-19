SUMMARY = "ZIP compression library"
DESCRIPTION = "ZZipLib is a library for dealing with ZIP and ZIP-like archives by \
using algorithms of zlib."
LICENSE = "LGPL-2.1-or-later"

PV = "0.13.80"

RPM_NAME = "libzzip-0-13-0.13.80-1.5.aarch64.rpm"
RPM_HASH = "41e659fec8b067d7ec70bc77fba352feef33c3acca842b72a47a85dc21e0a7bc80a8743b894ce6af49df9051eab9d3e2b2b90fc06d7066bc8791e230bf20b919"

RPROVIDES:${PN} += "libzzip-0-13 \
libzzip.so.13 \
libzzipfseeko.so.13 \
libzzipmmapped.so.13 \
libzzipwrap.so.13 \
zziplib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
