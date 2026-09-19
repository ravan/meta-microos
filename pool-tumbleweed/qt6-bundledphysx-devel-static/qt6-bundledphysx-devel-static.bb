SUMMARY = "Qt6 BundledPhysX static library"
DESCRIPTION = "The Qt6 BundledPhysX static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-bundledphysx-devel-static-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "aff7af6e360179acabab3b2ff17147df420cf752cd71af78134f5de7ca50654260a59ce5c118386410a32ddbbef9d5d151b08e2486fa5061985b573daf892fae"

RPROVIDES:${PN} += "cmake-Qt6BundledPhysX \
qt6-bundledphysx-devel-static"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate"

inherit rpm
