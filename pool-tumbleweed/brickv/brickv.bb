SUMMARY = "Tinkerforge Brick Viewer"
DESCRIPTION = "Small Qt GUI to control and test all Bricks and Bricklets from Tinkerforge."
LICENSE = "GPL-2.0-only"

PV = "2.4.27"

RPM_NAME = "brickv-2.4.27-1.3.noarch.rpm"
RPM_HASH = "98dc7b1b8deba8f72c6b93b12d69f001f7fe2cfee0d6f8bca907eb218a22613de00f0aa2585a9fbda802321dd5af631d48176a10f2dbdb863e363fa3887fbfeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brickv \
python3.13dist-brickv \
python3dist-brickv"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-pytz \
python3-qt5 \
python3-serial \
python3-tzlocal"

inherit rpm
