SUMMARY = "AV1 Codec Library Tools"
DESCRIPTION = "This package contains tools included with libaom, a library for \
the AOMedia Video 1 (AV1) video coding format."
LICENSE = "BSD-2-Clause"

PV = "3.13.1"

RPM_NAME = "aom-tools-3.13.1-2.5.aarch64.rpm"
RPM_HASH = "a9ef7406adb0b150ca00fcf585d64b3ae4fce2ed19cb722cce5afa182b3a28dbd39914d70ffb278688343ae22b91e21b510ca0bbe80ecb0ad8ad039bb9044fd0"

RPROVIDES:${PN} += "aom-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaom.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libyuv.so.0"

inherit rpm
