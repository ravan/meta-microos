SUMMARY = "A CLI version of the '2048' game"
DESCRIPTION = "2048 is a mathematics-based puzzle game where the player has to slide \
tiles on a grid to combine them and create a tile with the number 2048. \
The player has to merge the similar number tiles (2n) by moving the arrow \
keys in four different directions. When two tiles with the same number \
touch, they will merge into one."
LICENSE = "MIT"

PV = "0.9.1+git.20181118"

RPM_NAME = "2048-cli-0.9.1+git.20181118-2.9.aarch64.rpm"
RPM_HASH = "b6ebdc8a90d207b7b9b6a5a5bb0f8781b2580e2463d2b18e649726c934fd451baeb28fa294ff1e5602fb210aaadad27853574d83bd082fdfc3e39734808ef987"

RPROVIDES:${PN} += "2048-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
