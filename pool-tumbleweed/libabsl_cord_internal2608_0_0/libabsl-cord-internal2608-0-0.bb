SUMMARY = "Abseil library liblibabsl_cord_internal"
DESCRIPTION = "This package contains the libabsl_cord_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_cord_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "5dbd7d02619c2eba9397ba0456a8768be94550cff6d9660a09f2be9fe92f4b8cd98a40be5408f786e55e6b98d24dcc9b610f93409c1b1d1e610d6c22259a6c20"

RPROVIDES:${PN} += "libabsl-cord-internal.so.2608.0.0 \
libabsl-cord-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-crc-cord-state.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
