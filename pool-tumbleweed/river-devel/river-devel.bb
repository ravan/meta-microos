SUMMARY = "Development files for river"
DESCRIPTION = "Modules for interacting or modifying the River Wayland compositor."
LICENSE = "GPL-3.0-only"

PV = "0.3.12"

RPM_NAME = "river-devel-0.3.12-2.6.noarch.rpm"
RPM_HASH = "2d32081787e037c017a95a15dd06595130abbc8bb67cb2d797e44211c14f9ad9fbc7f0848f3bec95ce6f1d94c2260a0ec641b90a995b6e511db8db090d669cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-river-protocols \
river-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
river"

inherit rpm
