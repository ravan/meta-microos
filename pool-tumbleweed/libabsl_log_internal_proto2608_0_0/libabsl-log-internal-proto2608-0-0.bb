SUMMARY = "Abseil library liblibabsl_log_internal_proto"
DESCRIPTION = "This package contains the libabsl_log_internal_proto library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_internal_proto2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "ff223a5ee52e8c72fcbbd6c697389a52c31242aeb270de1b2fffed6f52d146b7f5d02603812eb99f0a5d939f7203b3ea2d897da545f57ee7074f44fc31b8d57a"

RPROVIDES:${PN} += "libabsl-log-internal-proto.so.2608.0.0 \
libabsl-log-internal-proto2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-throw-delegate.so.2608.0.0 \
libc.so.6"

inherit rpm
