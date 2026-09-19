SUMMARY = "Singular's Singular library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libSingular-4_4_1-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "f825f4ffd2e561b5f089c71100f05898cadbbd1f0f9216f6bcb1ed1c39679cfb865b4267ead9bfb7731fb32c716ec332ab1e9ffd74337fa9be8c8a3fa7747c04"

RPROVIDES:${PN} += "libSingular-4-4-1 \
libSingular-4.4.1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfactory-4.4.1.so \
libflint.so.24 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libomalloc-4.4.1.so \
libpolys-4.4.1.so \
libreadline.so.8 \
libsingular-resources-4.4.1.so \
libstdc++.so.6"

inherit rpm
