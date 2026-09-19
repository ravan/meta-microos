SUMMARY = "Abseil library liblibabsl_failure_signal_handler"
DESCRIPTION = "This package contains the libabsl_failure_signal_handler library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_failure_signal_handler2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "f149ea6ca45dd2e03f6dc12b0d8ffb6c009971983afbb7f6afbefa28fac9e9143b0d5b7aee692420a7b14d51dc8d7c9a406fcad026c6d82b73923cebf62addab"

RPROVIDES:${PN} += "libabsl-failure-signal-handler.so.2608.0.0 \
libabsl-failure-signal-handler2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
libabsl-examine-stack.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-stacktrace.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
