SUMMARY = "Shared library for LAL Frame"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Frame library."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "liblalframe14-3.0.7-1.5.aarch64.rpm"
RPM_HASH = "742bd3a980de7584cdcb54355081d0e69bb2c6aee8b86fc9ea678ca086645398ec0546f346d999d929a73b6c8e94cc74f68bda9d4c46155af3c4ca381c41f6b7"

RPROVIDES:${PN} += "liblalframe.so.14 \
liblalframe14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframel.so.8 \
liblal.so.20 \
liblalsupport.so.14 \
libm.so.6"

inherit rpm
