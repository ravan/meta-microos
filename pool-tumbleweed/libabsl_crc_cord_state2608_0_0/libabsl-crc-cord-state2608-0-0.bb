SUMMARY = "Abseil library liblibabsl_crc_cord_state"
DESCRIPTION = "This package contains the libabsl_crc_cord_state library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_crc_cord_state2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "280d0c70a0beecc0206497f2a1b7ff4f4b26329bc8b88c17f81d8be480ea2e23809a0dfd51379d862107b7158b082ff610cfbbdf2304a9720e58ada030c88dd2"

RPROVIDES:${PN} += "libabsl-crc-cord-state.so.2608.0.0 \
libabsl-crc-cord-state2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-crc32c.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
