SUMMARY = "Abseil library liblibabsl_crc_internal"
DESCRIPTION = "This package contains the libabsl_crc_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_crc_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "8280c644d3b0e91c98f385f4de4d27fd1dffea5314550424d13204df46136ac7c5c9a6825f74ac58c1750cbe2f849066e13e9137bd11b8891466de7438024a3c"

RPROVIDES:${PN} += "libabsl-crc-internal.so.2608.0.0 \
libabsl-crc-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
