SUMMARY = "Python library for i3 WM extensions"
DESCRIPTION = "python-i3ipc is a Python library for controlling the i3 window manager which \
aims to be used by scripts and applications which interact with the window \
manager like status line generators, notification daemons and pagers. \
 \
This library uses i3’s interprocess communication, which is the interface \
that i3 WM uses to receive commands from client applications such as i3-msg. It \
also features a publish/subscribe mechanism for notifying interested parties of \
window manager events."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python314-i3ipc-2.2.1-6.5.noarch.rpm"
RPM_HASH = "6a0bea599cb836db353236a5f56a14b21fff982c48773c6d331de30dde1273ed01d24c8a58487872cdc51faea181452b304bdb378b0244051a7ad14b136d9366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-i3ipc \
python314-i3ipc \
python3dist-i3ipc"

RDEPENDS:${PN} += "python-abi \
python314-python-xlib"

inherit rpm
