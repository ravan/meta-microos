SUMMARY = "Abseil library liblibabsl_kernel_timeout_internal"
DESCRIPTION = "This package contains the libabsl_kernel_timeout_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_kernel_timeout_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "aa82c169b2b5687235e52f85a5994a8b3795b60aab991c858f923233427b38a881b2de5ba5a37d2fb435c37b948cdce8d61bf2255790720b482cda82affa0ab4"

RPROVIDES:${PN} += "libabsl-kernel-timeout-internal.so.2608.0.0 \
libabsl-kernel-timeout-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
