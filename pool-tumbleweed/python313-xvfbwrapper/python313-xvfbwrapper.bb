SUMMARY = "Python wrapper for controlling X virtual framebuffer (Xvfb)"
DESCRIPTION = "Xvfb (X virtual framebuffer) is a display server implementing the X11 \
display server protocol. It runs in memory and does not require a \
physical display.  Only a network layer is necessary. \
 \
Xvfb is useful for running acceptance tests on headless servers."
LICENSE = "MIT"

PV = "0.2.10"

RPM_NAME = "python313-xvfbwrapper-0.2.10-1.5.noarch.rpm"
RPM_HASH = "ed7e8602226e50ec0d3cf684e38e72cad84846e10e2ed89aae8efe0d6d4c6fb4710256686c0da688a7644faebf1f81efe04824e11dec0f173970ee07cba60612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xvfbwrapper \
python3.13dist-xvfbwrapper \
python313-xvfbwrapper \
python3dist-xvfbwrapper"

RDEPENDS:${PN} += "python-abi \
xorg-x11-Xvfb"

inherit rpm
