SUMMARY = "Simple remote viewer for virtui-manager"
DESCRIPTION = "A simple remote viewer application bundled with virtui-manager. \
It supports VNC and SPICE protocols."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "virtui-remote-viewer-3.2.1-1.1.noarch.rpm"
RPM_HASH = "ee1686320754c569c5554b0fdd378ae7747bc93523da2633e8e6d0d67a6a9ce8a7f80478dcfd00dd7dfd0ec731fc931e5d0f079f4f051910bc6a4dfecb208789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virtui-remote-viewer"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
gtk3 \
python-abi \
python3-gobject \
python3-libvirt-python \
virtui-manager \
vte"

inherit rpm
