SUMMARY = "Abseil library liblibabsl_flags_reflection"
DESCRIPTION = "This package contains the libabsl_flags_reflection library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_reflection2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "e6416040d519437d24222d0452efc2244f3cf6f0a547f54e73d283c4d153e43551a5b30e377e47cce6eb9c2ad2da7c92abfc6e48a5c8f01e2dde06c3f6622b13"

RPROVIDES:${PN} += "libabsl-flags-reflection.so.2608.0.0 \
libabsl-flags-reflection2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-flags-commandlineflag.so.2608.0.0 \
libabsl-flags-config.so.2608.0.0 \
libabsl-flags-private-handle-accessor.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
