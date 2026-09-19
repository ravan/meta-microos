SUMMARY = "Qt based cross-platform GUI proxy configuration manager (backend: sing-box)"
DESCRIPTION = "Qt based cross-platform GUI proxy configuration manager (backend: sing-box)."
LICENSE = "GPL-3.0-only"

PV = "5.11.28.2"

RPM_NAME = "nekobox-5.11.28.2-1.1.aarch64.rpm"
RPM_HASH = "b18d0e2e7aefd6f16666670f17bc2741c526d6411eed25c90e37096213f27c03a704c989d2c6279649d3e084a0582b54c983c6e080040bfe1e67854f0a36310f"

RPROVIDES:${PN} += "nekobox"

RDEPENDS:${PN} += "nekobox-core \
nekobox-qt"

inherit rpm
