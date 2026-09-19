SUMMARY = "Terminal based CPU stress and monitoring utility"
DESCRIPTION = "Terminal UI for monitoring your computer to monitor CPU temperature, frequency, \
power and utilization in a graphical way from the terminal."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.0"

RPM_NAME = "s-tui-1.5.0-1.1.noarch.rpm"
RPM_HASH = "b126447605498ce6efee92e72f021362e074aa2d71dffefcb5640d9b213b31b1851cb8fdd9de9dc9af1520f0728a4764831b6faadf4545672a730e543dff7365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-s-tui \
python3dist-s-tui \
s-tui"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-psutil \
python3-typing-extensions \
python3-urwid"

inherit rpm
