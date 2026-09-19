SUMMARY = "A 2-D game engine for Python"
DESCRIPTION = "The SGE Game Engine is a general-purpose 2-D game engine. It takes \
care of several details, such as window size management, collision \
detection, parallax scrolling, image transformation. \
 \
This implementation of the SGE uses Pygame as a backend."
LICENSE = "LGPL-3.0-or-later"

PV = "1.7.1"

RPM_NAME = "python313-sge-pygame-1.7.1-2.5.noarch.rpm"
RPM_HASH = "9bba4e481b84284f920ff4bb332bc8103e12f43dfc2044b768cc141b6ff7fb86a9a3f12bb42c43164b17818735c2d940c574389b82f66bb2336e05de35e5e7b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sge-pygame \
python3.13dist-sge \
python313-sge-pygame \
python3dist-sge"

RDEPENDS:${PN} += "python-abi \
python313-pygame \
python313-six \
python313-uniseg"

inherit rpm
