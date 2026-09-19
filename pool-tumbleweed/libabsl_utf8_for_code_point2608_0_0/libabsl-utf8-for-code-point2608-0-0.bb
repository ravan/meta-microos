SUMMARY = "Abseil library liblibabsl_utf8_for_code_point"
DESCRIPTION = "This package contains the libabsl_utf8_for_code_point library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_utf8_for_code_point2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "c0bafba429d5ae9695f283656fcc64d1ba2693c0dc778b0240fe039aeea50bb569fbba5153930c8944541588898b53a00a98f87bd5525154d82d71ceff5859b6"

RPROVIDES:${PN} += "libabsl-utf8-for-code-point.so.2608.0.0 \
libabsl-utf8-for-code-point2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
