SUMMARY = "Abseil library liblibabsl_raw_logging_internal"
DESCRIPTION = "This package contains the libabsl_raw_logging_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_raw_logging_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "e1e3108345e48122e6c7e8bf82503bab8e955a77d2b6e45d794b7d59383331ea5e491c866c0be9eb4a5e332d8dd999e3f318340bad4f41b173de83ba77a81119"

RPROVIDES:${PN} += "libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-raw-logging-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
