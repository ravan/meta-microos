SUMMARY = "Themes for Kvantum engine"
DESCRIPTION = " \
This package provides extra themes for Kvantum engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "kvantum-themes-1.1.8-1.2.noarch.rpm"
RPM_HASH = "531b78777a14b1bc9fce3d472ccbb9011290bb2ad929d8b8c373e5441446aa7e3ebacd120154768a60644b94d0e26e86ed5c02caabc84709f13139355cbf715b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvantum-themes"

RDEPENDS:${PN} += ""

inherit rpm
