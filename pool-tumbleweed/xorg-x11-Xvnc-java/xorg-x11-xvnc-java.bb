SUMMARY = "VNC viewer in java"
DESCRIPTION = "A VNC client written in java that can be used as standalone application or as \
an applet inside web page."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.16.1"

RPM_NAME = "xorg-x11-Xvnc-java-1.16.1-3.1.noarch.rpm"
RPM_HASH = "0a1bde4bd4f50597a8ecf4dd21f0f11dcc5a6642d1f8a2c61c0edb866197c5c5012cec17ae826c4ae746913415641fbfd6582b1efed7296396e19cbee6e32b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-Xvnc-java"

RDEPENDS:${PN} += "systemd"

inherit rpm
