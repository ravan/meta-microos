SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.8"

RPM_NAME = "python314-python-mpv-1.0.8-1.5.noarch.rpm"
RPM_HASH = "961cd88f5e3ded32e4d948000e17127cec032717d8b9a9f32f09f9a0eeb505ecdda5526e332aa954528718281c8d53f128df2008265972d181a8815a39fd3f99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-mpv \
python314-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
