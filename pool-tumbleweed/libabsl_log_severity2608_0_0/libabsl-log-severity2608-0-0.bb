SUMMARY = "Abseil library liblibabsl_log_severity"
DESCRIPTION = "This package contains the libabsl_log_severity library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_severity2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "73ecece5f1a7b17f846a154daf240b9362606bb4234167558ef7027b90f9a8fd7b44cd0640c4754b3b94110355c42ee6b134427818afbfabda94c6f946f2ade5"

RPROVIDES:${PN} += "libabsl-log-severity.so.2608.0.0 \
libabsl-log-severity2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libstdc++.so.6"

inherit rpm
