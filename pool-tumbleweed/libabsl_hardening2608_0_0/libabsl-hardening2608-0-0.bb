SUMMARY = "Abseil library liblibabsl_hardening"
DESCRIPTION = "This package contains the libabsl_hardening library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_hardening2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "f2a2e7a9f70d21706ccb6879bfb6128c3fac8d95c8575d2a8270ae0bb2b4ff9ed481a00a1fa7d5d4752612d7eabf4da678373fb291ba0cdf634f072a88aff39f"

RPROVIDES:${PN} += "libabsl-hardening.so.2608.0.0 \
libabsl-hardening2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
