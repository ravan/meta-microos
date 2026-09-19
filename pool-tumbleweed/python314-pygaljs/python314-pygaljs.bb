SUMMARY = "Python package providing assets pygaljs"
DESCRIPTION = "Python package providing assets from https://github.com/Kozea/pygal.js"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python314-pygaljs-1.0.2-3.5.noarch.rpm"
RPM_HASH = "b3937c0806f1c5b432a31da52368acbf833c22e63d4e0ee69ec45b30bd078173ff18a878c4672961ee31650f4e391929689587398fd176cad5b8f18db4f138f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygaljs \
python314-pygaljs \
python3dist-pygaljs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
