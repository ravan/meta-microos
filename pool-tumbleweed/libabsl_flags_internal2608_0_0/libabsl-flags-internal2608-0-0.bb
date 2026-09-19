SUMMARY = "Abseil library liblibabsl_flags_internal"
DESCRIPTION = "This package contains the libabsl_flags_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "fbc8ac40ee8dd4d5dd3fa7e662acd16f96e45d46c3f3490d19350cecd590fd9950d0a7dd2beabad25d1a8957e32ebecf0eee2c7136e201d96c104f77fa3c90e1"

RPROVIDES:${PN} += "libabsl-flags-internal.so.2608.0.0 \
libabsl-flags-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-flags-commandlineflag-internal.so.2608.0.0 \
libabsl-flags-commandlineflag.so.2608.0.0 \
libabsl-flags-config.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
