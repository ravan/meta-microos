SUMMARY = "Wrapper that starts x0vncserver"
DESCRIPTION = "This is a wrapper that looks like x11vnc, but starts x0vncserver instead. \
It maps common x11vnc arguments to x0vncserver arguments."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.16.1"

RPM_NAME = "tigervnc-x11vnc-1.16.1-3.1.noarch.rpm"
RPM_HASH = "6f76963248494537b5f8ab2d73e337dcd0b3118b0f28053ace6d0e9a0faefde2bc5d38e0dd8412334301eb8ad6ce1c93684858c52a71d475649ba58ddf07bdea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tigervnc-x11vnc \
x11vnc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
xorg-x11-Xvnc"

inherit rpm
