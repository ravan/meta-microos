SUMMARY = "Abseil library liblibabsl_leak_check"
DESCRIPTION = "This package contains the libabsl_leak_check library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_leak_check2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "dc34911c53b9fb43d4105a19c39806b9fb57358364d86c753c990d4ec65a4b10ee95d70908e49554d450dff45da556320640ee5a0cef1ca78402e837fe26d345"

RPROVIDES:${PN} += "libabsl-leak-check.so.2608.0.0 \
libabsl-leak-check2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
