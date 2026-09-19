SUMMARY = "Set of utilities to run headless X/Wayland clients"
DESCRIPTION = "xwayland-run contains a set of small utilities revolving around running \
Xwayland and various Wayland compositor headless."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.6"

RPM_NAME = "xwayland-run-0.0.6-1.2.noarch.rpm"
RPM_HASH = "a4a7866865bf551f2cacfdcc36edadd298fe35f526695f99e7cad12eae3fb67cee48406d35cd41dcdfd1c45f7cc7696d2b2a3210cc9b9823c5b188aa26108165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wlheadless-run \
xwayland-run \
xwfb-run"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
dbus-1-daemon \
python-abi \
xauth \
xorg-x11-server-wayland"

inherit rpm
