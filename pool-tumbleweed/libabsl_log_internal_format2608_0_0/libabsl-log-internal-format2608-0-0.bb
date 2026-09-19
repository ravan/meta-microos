SUMMARY = "Abseil library liblibabsl_log_internal_format"
DESCRIPTION = "This package contains the libabsl_log_internal_format library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_internal_format2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "6c3109b4391a59184b37df50b0f2f1900793221c05f36b979edd876007001f74e44525871e7877faf49e730c73a2b3309c177745b6dba325d9fd2b612fc6a320"

RPROVIDES:${PN} += "libabsl-log-internal-format.so.2608.0.0 \
libabsl-log-internal-format2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-log-internal-globals.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libc.so.6"

inherit rpm
