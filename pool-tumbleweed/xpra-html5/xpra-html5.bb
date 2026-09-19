SUMMARY = "HTML5 client for Xpra"
DESCRIPTION = "This is the HTML5 client for Xpra, \
which can be made available for browsers by the xpra server \
or by any other web server."
LICENSE = "GPL-2.0+ & BSD-3-Clause & LGPL-3.0+ & MIT"

PV = "20"

RPM_NAME = "xpra-html5-20-1.2.noarch.rpm"
RPM_HASH = "2b94cd52bf667a341abf74eef8915e6c8b82f3b6615ba2c6123d2328dacdd1a92b418d3e7fb87c1d2a71756827fc3f3d5888653fe41626c4635a5e796bc996e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xpra-html5 \
xpra-html5"

RDEPENDS:${PN} += "cups-client \
dejavu-fonts \
python3-avahi \
python3-paramiko \
python3-pyinotify \
python3-pyxdg \
python3-websockify \
python3-zeroconf \
qrencode \
xpra"

inherit rpm
