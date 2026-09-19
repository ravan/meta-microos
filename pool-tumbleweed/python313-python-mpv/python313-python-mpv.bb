SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.8"

RPM_NAME = "python313-python-mpv-1.0.8-1.5.noarch.rpm"
RPM_HASH = "484f6e24f3ca4687dee9e965c5ed1a861d07646d710161d550210eb37ed96c0aa5aa44ae97ab6deedb52e52454ad3d52c5614a4cf7ed93096d2c982295604e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-mpv \
python3.13dist-python-mpv \
python313-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
