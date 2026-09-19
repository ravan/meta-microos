SUMMARY = "Library for Vamp audio analysis plugins"
DESCRIPTION = "Vamp is an API for C and C++ plugins that process sampled audio data \
to produce descriptive output (measurements or semantic observations)."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "libvamp-sdk2-2.10.0-1.24.aarch64.rpm"
RPM_HASH = "7b96f4ffe97d6534018606a702e2ccd72ac84e419986ff035f1c955bda754adf382aa64a05494e3295d38f5137a90e6713beed1850095b90cfa89b1fdb76a1b1"

RPROVIDES:${PN} += "libvamp-sdk.so.2 \
libvamp-sdk2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
