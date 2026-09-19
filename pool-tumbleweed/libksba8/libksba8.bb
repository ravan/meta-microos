SUMMARY = "A X.509 Library"
DESCRIPTION = "KSBA is a library to simplify the task of working with X.509 \
certificates, CMS data, and related data."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later & MIT"

PV = "1.8.1"

RPM_NAME = "libksba8-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "9305d596df5920ced2b3e96da68102f051f96da9f0f608f772b95057bc292378677d54d8d19cd96578fa38bc0e188bf88cb1fd68b9a773f219766f41eee45913"

RPROVIDES:${PN} += "libksba \
libksba.so.8 \
libksba8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpg-error.so.0"

inherit rpm
