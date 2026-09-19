SUMMARY = "GNUnet library libgnunetfs"
DESCRIPTION = "This package contains the libgnunetfs library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetfs2-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "ba57c42ffd5de395752d82a55c95698cb0a29473f914bb918e50158a7930345a3bd06516e2dde6bf39973176db404ce335178e4cb4544210afd1d669f5cec6bb"

RPROVIDES:${PN} += "libgnunetfs.so.2 \
libgnunetfs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetdatastore.so.1 \
libgnunetutil.so.20 \
libunistring.so.5"

inherit rpm
