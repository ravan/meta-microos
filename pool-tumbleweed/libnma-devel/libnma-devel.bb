SUMMARY = "Development Files for libnma"
DESCRIPTION = "Development Files for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-devel-1.10.6-3.12.aarch64.rpm"
RPM_HASH = "6f534986f656195bdf2e6b5834bcfb79a5e64d89690e512c933739aec6d202b5a4f14de657317625d30eb3613f6a426c4fd6caaa7d037371a4108f404e628743"

RPROVIDES:${PN} += "libnma-devel \
pkgconfig-libnma"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnma0 \
pkgconfig-libnm \
typelib-1-0-NMA-1-0"

inherit rpm
