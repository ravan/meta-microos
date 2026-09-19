SUMMARY = "Abseil library liblibabsl_throw_delegate"
DESCRIPTION = "This package contains the libabsl_throw_delegate library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_throw_delegate2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "c8e15a8b75918a15c2437f200fa37eb42326064b1a0c25faaa2617ec7e5b3c68c84eae11de94e97c597a644df783b47a3d7cbfe3ed812841e6382eb9ee129a7a"

RPROVIDES:${PN} += "libabsl-throw-delegate.so.2608.0.0 \
libabsl-throw-delegate2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
