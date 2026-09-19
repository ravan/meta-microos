SUMMARY = "Abseil library liblibabsl_log_internal_structured_proto"
DESCRIPTION = "This package contains the libabsl_log_internal_structured_proto library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_log_internal_structured_proto2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "d61b74c92ed463f8b8d38669e2f2120a4321a52a24a0e731f83e41ee8c8bf4aef6b2599f7c68f30a24dc105658f7bad950747d7cecacfad5e3cbc3edba74144f"

RPROVIDES:${PN} += "libabsl-log-internal-structured-proto.so.2608.0.0 \
libabsl-log-internal-structured-proto2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-log-internal-proto.so.2608.0.0"

inherit rpm
