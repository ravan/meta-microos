SUMMARY = "Abseil library liblibabsl_log_initialize"
DESCRIPTION = "This package contains the libabsl_log_initialize library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_initialize2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "2727b0bb35018bb5aeb580666800104541632c4d66d2754a4038965c7e702635815b1a736591a723f073bf3f16f539b9bd1c8fa97f9e87d01183933e40cce51b"

RPROVIDES:${PN} += "libabsl-log-initialize.so.2608.0.0 \
libabsl-log-initialize2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-log-internal-globals.so.2608.0.0 \
libabsl-time-zone.so.2608.0.0"

inherit rpm
