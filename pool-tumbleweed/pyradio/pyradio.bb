SUMMARY = "Curses based internet radio player"
DESCRIPTION = "A command line Internet radio player based on curses, that uses external media \
players to perform the actual playback. It currently supports the following \
players: MPV, MPlayer and VLC."
LICENSE = "MIT"

PV = "0.9.3.9"

RPM_NAME = "pyradio-0.9.3.9-1.8.noarch.rpm"
RPM_HASH = "d68e9193f0c1432e6e695e8979d9e86dab58801b01757f4e7cf8aab6e57b613e5a29ac264380db624f0a32b24508afc52790e7fb2f5930ceb1426f3ac1fee40d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyradio \
python3.13dist-pyradio \
python3dist-pyradio"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-rich"

inherit rpm
