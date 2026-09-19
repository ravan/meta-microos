SUMMARY = "Session files for LXQT-niri"
DESCRIPTION = "This package contains the files necessary to use niri as the Wayland compositor \
for LXQt"
LICENSE = "GPL-3.0-or-later"

PV = "0.4.1"

RPM_NAME = "lxqt-niri-session-0.4.1-1.2.noarch.rpm"
RPM_HASH = "955983cdc66bee604ada5fc27d7dcbeda796ec1c832fab70b5a2f0c92e71e58298e547193b9045ae9be012fca357016c262bda50f1abe68896d08a62d0ae65eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-niri-session"

RDEPENDS:${PN} += "lxqt-wayland-session \
niri"

inherit rpm
