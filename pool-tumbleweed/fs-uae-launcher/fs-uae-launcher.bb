SUMMARY = "Graphical configuration frontend and launcher for FS-UAE"
DESCRIPTION = "FS-UAE Launcher is a graphical configuration program and launcher for FS-UAE."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.35"

RPM_NAME = "fs-uae-launcher-3.2.35-3.4.noarch.rpm"
RPM_HASH = "94657ce44ab4f2dd4f5c7d39ed2d565b54665b85c9243563d4b7b67988b143fe39afbb1dc5544f55d31bd6db505a95234aea09ebfc7f08c327fdf870247d2584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fs-uae-launcher"

RDEPENDS:${PN} += "/usr/bin/python3 \
fs-uae \
python3-PyQt6 \
python3-opengl \
python3-requests"

inherit rpm
