SUMMARY = "Abseil library liblibabsl_cord"
DESCRIPTION = "This package contains the libabsl_cord library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_cord2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "c4c47b2d6e94a243a90f932dbe20619b26e4fa62d859c54bf9e3ec43f3c2a1878937daa0a1c2a30660fc82b89372aa21b79a2e29fef8e47c4ee4d47f24b69550"

RPROVIDES:${PN} += "libabsl-cord.so.2608.0.0 \
libabsl-cord2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord-internal.so.2608.0.0 \
libabsl-cordz-functions.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-crc-cord-state.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
