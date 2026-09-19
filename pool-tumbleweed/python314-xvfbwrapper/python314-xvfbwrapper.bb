SUMMARY = "Python wrapper for controlling X virtual framebuffer (Xvfb)"
DESCRIPTION = "Xvfb (X virtual framebuffer) is a display server implementing the X11 \
display server protocol. It runs in memory and does not require a \
physical display.  Only a network layer is necessary. \
 \
Xvfb is useful for running acceptance tests on headless servers."
LICENSE = "MIT"

PV = "0.2.10"

RPM_NAME = "python314-xvfbwrapper-0.2.10-1.5.noarch.rpm"
RPM_HASH = "7af1d0ba5d43160529abf0b570a6a6b097f87b5928f0f890dc819f5b76c538307f903ed6dabf80f50dbd07f83184d08215ac84c5bd272d23fa5823cb4831f985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xvfbwrapper \
python314-xvfbwrapper \
python3dist-xvfbwrapper"

RDEPENDS:${PN} += "python-abi \
xorg-x11-Xvfb"

inherit rpm
