SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.8"

RPM_NAME = "python312-python-mpv-1.0.8-1.2.noarch.rpm"
RPM_HASH = "da5206991a38eb6696af5761b40d24f6376495de2363bac8af4236683a3dcba21ef2894389dae5d567ef33022fb8a7ca79b0e79cba0f369eb1fb151f0e76bb40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-python-mpv \
python312-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
