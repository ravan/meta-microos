SUMMARY = "Abseil library liblibabsl_exponential_biased"
DESCRIPTION = "This package contains the libabsl_exponential_biased library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_exponential_biased2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "e457e365f24d5df9ef8fb6d45d249a639dacaebbfbabc36750f19b25f4a757662d11a3cda6ab6d617d689ae3f70b758b42611689120b3be51f158ab8faf1f05a"

RPROVIDES:${PN} += "libabsl-exponential-biased.so.2608.0.0 \
libabsl-exponential-biased2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
