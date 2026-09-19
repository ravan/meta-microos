SUMMARY = "GNUnet library libgnunetsetu"
DESCRIPTION = "This package contains the libgnunetsetu library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetsetu0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "8ddb594e22c11fcbe69b5193e8fd9895d200ed9e99bbedbb413127c4d16d333600436090b92431fefd3aef63f109d572afa07fe2606c9a2238f524fce889c109"

RPROVIDES:${PN} += "libgnunetsetu.so.0 \
libgnunetsetu0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
