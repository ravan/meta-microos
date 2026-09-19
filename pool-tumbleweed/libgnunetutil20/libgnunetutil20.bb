SUMMARY = "GNUnet library libgnunetutil"
DESCRIPTION = "This package contains the libgnunetutil library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetutil20-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "07391d05a66c9bfb0444d3850ddad0111455659a306a35d1e6a6abb35686c5212fa5cd64f579890c376cb7126fda697d8e6e2a39c27ff9e6a804b23b9f00915f"

RPROVIDES:${PN} += "libgnunetutil.so.20 \
libgnunetutil20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgmp.so.10 \
libidn2.so.0 \
libltdl.so.7 \
libsodium.so.26 \
libunistring.so.5 \
libz.so.1"

inherit rpm
