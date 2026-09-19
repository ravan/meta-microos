SUMMARY = "Abseil library liblibabsl_random_internal_platform"
DESCRIPTION = "This package contains the libabsl_random_internal_platform library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_internal_platform2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "caedaa9e700c3059a949193c02f90ed2ed57e87c30e7fcded76ee57319bb78061be4651dea2060b989b8bfc1ee029873d856cd7ae1bd455224f0f31b5ee0ce18"

RPROVIDES:${PN} += "libabsl-random-internal-platform.so.2608.0.0 \
libabsl-random-internal-platform2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
