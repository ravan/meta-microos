SUMMARY = "Session files for LXQt-Miriway"
DESCRIPTION = "This package contains the files necessary to use Miriway as the Wayland \
compositor with LXQt"
LICENSE = "GPL-3.0-or-later"

PV = "0.4.1"

RPM_NAME = "lxqt-miriway-session-0.4.1-1.2.noarch.rpm"
RPM_HASH = "7742e59f7978ee9de768e74d0c373108a59f71f9ac7acf346cf36be1d3b28d858c2b5468f585eb1432d03c9700ce5f43f8bcbb9abb4dfada1d64ccb6b1ad1d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-miriway-session"

RDEPENDS:${PN} += "lxqt-wayland-session \
miriway"

inherit rpm
