SUMMARY = "Qt6 BundledEmbree static library"
DESCRIPTION = "The Qt6 BundledEmbree static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-bundledembree-devel-static-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "86bc456523297214bfd19a1c011e42021289b2e3a752729d0346be1f9438d1e5fd7dfc53de2f5ad1a4e6320327dbf36c10f7c1de3eebc1cdf555f6a91f76c679"

RPROVIDES:${PN} += "cmake-Qt6BundledEmbree \
qt6-bundledembree-devel-static"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate"

inherit rpm
