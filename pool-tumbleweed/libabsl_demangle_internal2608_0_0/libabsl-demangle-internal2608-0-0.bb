SUMMARY = "Abseil library liblibabsl_demangle_internal"
DESCRIPTION = "This package contains the libabsl_demangle_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_demangle_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "fbaff6d88dac30233c1849fac0548daf11b48aa5b6db29239d72fb84bd95256b9d02cbc8c0f36a1bc036466ed4b6ec63ed8f834fbef91102332622652b3d2b83"

RPROVIDES:${PN} += "libabsl-demangle-internal.so.2608.0.0 \
libabsl-demangle-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-demangle-rust.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
