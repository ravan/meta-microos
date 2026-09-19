SUMMARY = "GNUnet library libgnunetnamecache"
DESCRIPTION = "This package contains the libgnunetnamecache library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetnamecache0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "df7a8cd879f18a113be5f4c7c1ffb314fb7cf5d307a9e2be252605e187e267b1a6f2c1402d7369b47c91b6c4a2d323ebb3ca16adabe64e56d5bd299d61a7aed9"

RPROVIDES:${PN} += "libgnunetnamecache.so.0 \
libgnunetnamecache0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetgnsrecord.so.0 \
libgnunetutil.so.20"

inherit rpm
