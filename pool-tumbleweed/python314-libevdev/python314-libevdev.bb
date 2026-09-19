SUMMARY = "Python wrapper around the libevdev C library"
DESCRIPTION = "python-libevdev is a wrapper around the libevdev C library, with a \
pythonic API."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "python314-libevdev-0.13.1-1.5.noarch.rpm"
RPM_HASH = "f1653980fb69704dc0cdc064dcf2d35a68a0ff9d5d285367ee09a25830655aaa5818d66047ffffcafa44557fac75822cc37df3c9f2ece297178f16758216593b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-libevdev \
python314-libevdev \
python3dist-libevdev"

RDEPENDS:${PN} += "libevdev2 \
python-abi"

inherit rpm
