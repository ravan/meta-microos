SUMMARY = "Shared library for libwpe"
DESCRIPTION = "General-purpose library developed for the WPE-flavored port of \
WebKit. \
This package contains the shared libary of libwpe."
LICENSE = "BSD-2-Clause"

PV = "1.16.3"

RPM_NAME = "libwpe-1_0-1-1.16.3-1.5.aarch64.rpm"
RPM_HASH = "62ed1594d4939a2e95c1a87bbecdeb9501e09b8c10f739b39b4fa30d0618aec38f3ba30161bdc6cccb80bebad4ee025969a846e4cc01daa6fbda0829bc09ba5b"

RPROVIDES:${PN} += "libwpe-1-0-1 \
libwpe-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
