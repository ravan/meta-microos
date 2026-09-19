SUMMARY = "Shared library files for aws-c-auth library"
DESCRIPTION = "AWS C99 library implementation of AWS client-side authentication: \
standard credentials providers and signing. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.10.5"

RPM_NAME = "libaws-c-auth1_0_0-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "b2f537ae83f149173ba3c9bc378d218d44408d544028430ace30346a0006abee24cad22f1f44f85ccc6e6f1077e9208d56bee03471c586b2d234352352fa0921"

RPROVIDES:${PN} += "libaws-c-auth.so.1.0.0 \
libaws-c-auth1 \
libaws-c-auth1-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-cal.so.0unstable \
libaws-c-common.so.1 \
libaws-c-http.so.1.0.0 \
libaws-c-io.so.0unstable \
libaws-c-sdkutils.so.1.0.0 \
libc.so.6"

inherit rpm
