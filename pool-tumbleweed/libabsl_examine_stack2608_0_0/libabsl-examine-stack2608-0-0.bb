SUMMARY = "Abseil library liblibabsl_examine_stack"
DESCRIPTION = "This package contains the libabsl_examine_stack library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_examine_stack2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "cc0f1af6c1f9d9523ceb53a3b77c48bd0609c1b170e723074a21a9deb06ff71c6c3e422c099fa154356ef2e1d8d1e668e02e110f8010cb10a273fe75a4a74632"

RPROVIDES:${PN} += "libabsl-examine-stack.so.2608.0.0 \
libabsl-examine-stack2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-stacktrace.so.2608.0.0 \
libabsl-symbolize.so.2608.0.0 \
libc.so.6"

inherit rpm
