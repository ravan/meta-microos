SUMMARY = "Backtrace C library"
DESCRIPTION = "This is a C library that may be linked into a C/C++ program to produce symbolic backtraces."
LICENSE = "BSD-3-Clause"

PV = "1.0+git20260601"

RPM_NAME = "libbacktrace0-1.0+git20260601-1.3.aarch64.rpm"
RPM_HASH = "42f4880aee85674c3d33a2252dffb44ec902ad548adbe7516ea8e5eaecf35557a2c693b401abebb9913789635102530af8a45db6fceaaeaeeaa20f563886d370"

RPROVIDES:${PN} += "libbacktrace.so.0 \
libbacktrace0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
