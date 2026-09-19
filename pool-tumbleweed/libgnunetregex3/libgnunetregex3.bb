SUMMARY = "GNUnet library libgnunetregex"
DESCRIPTION = "This package contains the libgnunetregex library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetregex3-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "67288ae19a1f7d544fea155b04acc87c780ad5498ae2d1fd3d82b84b8e9f8453bb88acf2b37fe1b1e42d6cd346de593615bfbd8bee1073729566ffa0e430474b"

RPROVIDES:${PN} += "libgnunetregex.so.3 \
libgnunetregex3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
