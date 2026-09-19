SUMMARY = "Abseil library liblibabsl_log_internal_conditions"
DESCRIPTION = "This package contains the libabsl_log_internal_conditions library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_internal_conditions2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "1fa54a33d261462f277fb04e8c078d98ead9154d750dfc50b31161bb2bd992ea0314e5ae17abf695bab421cad27942dee533510921792f7343b26c47156ebd25"

RPROVIDES:${PN} += "libabsl-log-internal-conditions.so.2608.0.0 \
libabsl-log-internal-conditions2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-base.so.2608.0.0 \
libc.so.6"

inherit rpm
