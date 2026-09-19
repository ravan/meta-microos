SUMMARY = "Abseil library liblibabsl_log_internal_fnmatch"
DESCRIPTION = "This package contains the libabsl_log_internal_fnmatch library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_internal_fnmatch2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "42207b9c9bad3606357affe1eb08b323470d2efe650b962f9fc61b6a2ad475a379a6b21f7c5fd3f76e0dda501001e9dce467ff441da792f604713b26853f92b5"

RPROVIDES:${PN} += "libabsl-log-internal-fnmatch.so.2608.0.0 \
libabsl-log-internal-fnmatch2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
