SUMMARY = "Qt 5 Wayland Addon Non-ABI stable experimental API files"
DESCRIPTION = "This package provides private headers of libqt5-qtwayland that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde55"

RPM_NAME = "libqt5-qtwayland-private-headers-devel-5.15.19+kde55-1.2.noarch.rpm"
RPM_HASH = "3bc3753fbb9bae84b9b8189c67060441ee3aefa7b202d95d5df2bf8db1ace168aaaf3e8baec596246afd4af5b314acee158969e7cf9860b1503274915c11be13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwayland-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtwayland-devel"

inherit rpm
