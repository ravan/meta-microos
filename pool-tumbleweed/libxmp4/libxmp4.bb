SUMMARY = "Module Player library for MOD, S3M, IT and others"
DESCRIPTION = "libxmp is a module player library which supports many module formats, \
including Protacker MOD, ScreamTracker S3M and ImpulseTracker IT."
LICENSE = "MIT"

PV = "4.7.3"

RPM_NAME = "libxmp4-4.7.3-1.1.aarch64.rpm"
RPM_HASH = "0d11187760e5706adc90420b2ef0f5382f38658a0833a98d3d47d2af7568ffe94135a5f9406558305b152b41ef5f72f67d24368df1ec3f64ec6133d6b042002a"

RPROVIDES:${PN} += "libxmp.so.4 \
libxmp4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
