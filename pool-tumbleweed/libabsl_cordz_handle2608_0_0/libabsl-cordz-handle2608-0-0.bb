SUMMARY = "Abseil library liblibabsl_cordz_handle"
DESCRIPTION = "This package contains the libabsl_cordz_handle library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_cordz_handle2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "43e8758eb9f8d8c44674f6465cefd4fe16946ec8d0adc445d7d442543ac571b3b4d1356103ebf4f1f24bb1bf1d5b118f04936e22f37c69b54ced84beddefe1bc"

RPROVIDES:${PN} += "libabsl-cordz-handle.so.2608.0.0 \
libabsl-cordz-handle2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
