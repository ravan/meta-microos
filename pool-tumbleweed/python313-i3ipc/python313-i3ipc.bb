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

RPM_NAME = "python313-i3ipc-2.2.1-6.5.noarch.rpm"
RPM_HASH = "e099d38345b24f1e5c601d6548e0a346277ff4760ab3506909d3de4b811da1d3e6946e79c4d21f92f90c262151927e8da0f61b6d3af3fa283f8e44be02ec96ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-i3ipc \
python3.13dist-i3ipc \
python313-i3ipc \
python3dist-i3ipc"

RDEPENDS:${PN} += "python-abi \
python313-python-xlib"

inherit rpm
