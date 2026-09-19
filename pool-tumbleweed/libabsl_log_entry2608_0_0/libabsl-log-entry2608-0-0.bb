SUMMARY = "Abseil library liblibabsl_log_entry"
DESCRIPTION = "This package contains the libabsl_log_entry library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_entry2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "c3378d2c21c637c3cd58b8186443da84448c41740609536314cdceb29976c1b9998148beeec51da1e9d25646621ceb0ffc263379c6b03b82bc9bf83672170c44"

RPROVIDES:${PN} += "libabsl-log-entry.so.2608.0.0 \
libabsl-log-entry2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-log-internal-proto.so.2608.0.0 \
libabsl-log-severity.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
