SUMMARY = "Abseil library liblibabsl_crc32c"
DESCRIPTION = "This package contains the libabsl_crc32c library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_crc32c2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "2d892ff48a90f7b7d8de232c56200d5453587dade7b224c561431b7fb00eb98a0493edcd4b572297e6c548e997895ca75509082b7e5e6c1c19195f8d19a6aedb"

RPROVIDES:${PN} += "libabsl-crc32c.so.2608.0.0 \
libabsl-crc32c2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-crc-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
