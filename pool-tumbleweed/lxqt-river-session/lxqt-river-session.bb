SUMMARY = "Session files for LXQt-river"
DESCRIPTION = "This package contains the files necessary to use river as the Wayland \
compositor with LXQt"
LICENSE = "GPL-3.0-or-later"

PV = "0.4.1"

RPM_NAME = "lxqt-river-session-0.4.1-1.2.noarch.rpm"
RPM_HASH = "ef2c3e43a98ecd621b2a7f7f0d113c3cc84f2e0418d1142c3f0974a421ab794dcf98ae5ce9cdea447a9591cd0c4c9b04ea91e59febc5b5c1a1a4a5873d069ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-river-session"

RDEPENDS:${PN} += "lxqt-wayland-session \
river"

inherit rpm
