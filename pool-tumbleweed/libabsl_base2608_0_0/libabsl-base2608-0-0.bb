SUMMARY = "Abseil library liblibabsl_base"
DESCRIPTION = "This package contains the libabsl_base library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_base2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "f6c0f22347e0146116a1378911eee7579e38bc42e36e0fa4e7554484858b64285dcc4e34a6a53a80af40c094ad8b18fb0399a48d7bba82429c249f078c835ef6"

RPROVIDES:${PN} += "libabsl-base.so.2608.0.0 \
libabsl-base2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
