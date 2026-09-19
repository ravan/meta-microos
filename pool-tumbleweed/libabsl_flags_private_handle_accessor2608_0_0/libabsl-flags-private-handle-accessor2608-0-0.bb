SUMMARY = "Abseil library liblibabsl_flags_private_handle_accessor"
DESCRIPTION = "This package contains the libabsl_flags_private_handle_accessor library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_private_handle_accessor2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "29ad80d912d8763bace20cae1fde9747c6cd4eb6705c38951f065a9ab4f71814e46b9e23a67f886468142003a6df8ac6b38ca3ffe51f2988f5c795f73824aede"

RPROVIDES:${PN} += "libabsl-flags-private-handle-accessor.so.2608.0.0 \
libabsl-flags-private-handle-accessor2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
