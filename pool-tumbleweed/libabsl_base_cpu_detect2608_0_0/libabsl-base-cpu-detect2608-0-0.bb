SUMMARY = "Abseil library liblibabsl_base_cpu_detect"
DESCRIPTION = "This package contains the libabsl_base_cpu_detect library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_base_cpu_detect2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "b1bfeeeb1998de4e6a404e6b542555dece07eacab27e796b600835319a30c0cb66d24e26877bf06a739abd4d617a9b3c79b0b62de1d1d04ba792bb5e74e5f3d9"

RPROVIDES:${PN} += "libabsl-base-cpu-detect.so.2608.0.0 \
libabsl-base-cpu-detect2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
