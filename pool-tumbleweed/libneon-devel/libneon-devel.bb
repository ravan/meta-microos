SUMMARY = "An HTTP and WebDAV Client Library"
DESCRIPTION = "neon is an HTTP and WebDAV client library with a C interface."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "0.37.1"

RPM_NAME = "libneon-devel-0.37.1-1.3.aarch64.rpm"
RPM_HASH = "1e4f6df01809a49918e6a309d15af6aa2f5e21a6c4124f9b1f7ad1252c52e667fdda3657321f385fb984032afa1c0d24cbf1a91c0647f7c109ac2353cd48f8b6"

RPROVIDES:${PN} += "libneon-devel \
neon-devel \
pkgconfig-neon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libneon27"

inherit rpm
