SUMMARY = "Test tools for the XTRX DSP library"
DESCRIPTION = "Test tools for the XTRX DSP library."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190830"

RPM_NAME = "xtrxdsp-tests-0.0.0+git.20190830-2.16.aarch64.rpm"
RPM_HASH = "41c682fab0f5e05e07057fe3f0fc046484a9ba464e0a6248ad49cf39b8ed3e8f089c4359bcb3b5e8b75b09c9dfab64b8938bd568d9267e18ba4b43a2549ecb4a"

RPROVIDES:${PN} += "xtrxdsp-tests"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxtrxdsp.so.0"

inherit rpm
