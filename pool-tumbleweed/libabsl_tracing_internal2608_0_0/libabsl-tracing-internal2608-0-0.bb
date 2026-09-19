SUMMARY = "Abseil library liblibabsl_tracing_internal"
DESCRIPTION = "This package contains the libabsl_tracing_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_tracing_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "7a0649b99805b22ac079284fe5a1d859e1a38ad4daca18a14178d9232260d0ecb2bd32cf96ea25f946aeaaad2e1d29e099d1bc3942235cc73b75da0429b8ac6f"

RPROVIDES:${PN} += "libabsl-tracing-internal.so.2608.0.0 \
libabsl-tracing-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
