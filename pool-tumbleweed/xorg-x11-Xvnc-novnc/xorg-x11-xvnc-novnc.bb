SUMMARY = "NoVNC service for Xvnc"
DESCRIPTION = "A service that starts noVNC linked to Xvnc server."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.16.1"

RPM_NAME = "xorg-x11-Xvnc-novnc-1.16.1-3.1.noarch.rpm"
RPM_HASH = "86692a9489686897a3ea76d0008cdade14185b6d83b4609c6d7994e7dcd6dfeb074507f9cbc17569980a9c886077d16fc69758c29de26a196bb449c9753452c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-Xvnc-novnc"

RDEPENDS:${PN} += "/usr/bin/sh \
novnc \
python3-websockify \
systemd \
xorg-x11-Xvnc"

inherit rpm
