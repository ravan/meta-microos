SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.8"

RPM_NAME = "python311-python-mpv-1.0.8-1.3.noarch.rpm"
RPM_HASH = "80c8a4b9a3f5392942ae61b45cac961ce30569d59aed92c4c88810a598fc8c9287a10a9ca9dc1be044313d93a0e7b8ce29ccd816d98670ad34c09ad55634a82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-mpv \
python311-python-mpv \
python3dist-python-mpv"

RDEPENDS:${PN} += "libmpv2 \
python-abi"

inherit rpm
