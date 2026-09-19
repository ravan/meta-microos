SUMMARY = "Abseil library liblibabsl_log_internal_message"
DESCRIPTION = "This package contains the libabsl_log_internal_message library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_internal_message2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "80feff5669efca40a6f160ae7344f24d11c4c24f1a3df3207d86575470e6987fff7980d404779e8136bede6c4e02cffb2a79df64b4b63b25e92ff1f24a81f30f"

RPROVIDES:${PN} += "libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-message2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
libabsl-examine-stack.so.2608.0.0 \
libabsl-log-globals.so.2608.0.0 \
libabsl-log-internal-format.so.2608.0.0 \
libabsl-log-internal-globals.so.2608.0.0 \
libabsl-log-internal-log-sink-set.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-log-internal-proto.so.2608.0.0 \
libabsl-log-internal-structured-proto.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-strerror.so.2608.0.0 \
libabsl-strings-internal.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
