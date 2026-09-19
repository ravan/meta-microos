SUMMARY = "A library implementing the EBU R128 loudness standard"
DESCRIPTION = "This library implements the EBU R 128 standard for loudness normalisation. \
 \
This package contains the shared library."
LICENSE = "MIT"

PV = "1.2.6"

RPM_NAME = "libebur128-1-1.2.6-2.6.aarch64.rpm"
RPM_HASH = "c1bfb84b88b90c002679236ebabacb74be14cdc0331eba86e08761e76679e3c86e8acdc0a72d34d9c85d2a60e8e564a24ffd84c3a4e85dcf80f3736d5e75b494"

RPROVIDES:${PN} += "libebur128-1 \
libebur128.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
