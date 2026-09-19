SUMMARY = "GNUnet library libgnunetrps"
DESCRIPTION = "This package contains the libgnunetrps library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetrps0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "876f52d5a8732eafdad5eaed1282b2fae1aaa410ec9bc4d5332b0bfc7ba0e6e5fb60658c88cdbf7bbcc50163e4b22e937c416eadd04249ebc944481136f959f6"

RPROVIDES:${PN} += "libgnunetrps.so.0 \
libgnunetrps0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetnse.so.0 \
libgnunetutil.so.20 \
libm.so.6"

inherit rpm
