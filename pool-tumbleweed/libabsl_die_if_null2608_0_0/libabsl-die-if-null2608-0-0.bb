SUMMARY = "Abseil library liblibabsl_die_if_null"
DESCRIPTION = "This package contains the libabsl_die_if_null library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_die_if_null2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "252e561256fa435984f65f782c5e9b0eaf5a6226180fa873e2513056acf053fa4b34f5c3d9a2c469773aef6c509bee4b889acc71c7d29e5683fe227c27770fb6"

RPROVIDES:${PN} += "libabsl-die-if-null.so.2608.0.0 \
libabsl-die-if-null2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
