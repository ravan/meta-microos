SUMMARY = "Development files for the FIFE 2D game engine"
DESCRIPTION = "FIFE stands for Flexible Isometric Free Engine and is a cross platform \
game creation framework. It provides the ability to create a \
game using Python interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "fife-devel-0.4.2-10.10.aarch64.rpm"
RPM_HASH = "f5832eed90e5822fb6499aebcf1665f7f51420e8d80277073d24d29584f3f6e6c6c37d49fe732ce5a667f4230e171c291b9d37fec6980f1371923adb462f2ae1"

RPROVIDES:${PN} += "fife-devel"

RDEPENDS:${PN} += "libfife0-4-2 \
python3-fife"

inherit rpm
