SUMMARY = "IONIC runtime library"
DESCRIPTION = "This package contains the ionic runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libionic1-63.0-1.3.aarch64.rpm"
RPM_HASH = "89486c11b24cc2824075651e4663c2dd7217f6a136cc388312873861181ffceb93b08da7d076e9345193e16c3fb09c5c0c05d983c9ba858774e34ae540318063"

RPROVIDES:${PN} += "libionic.so.1 \
libionic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
