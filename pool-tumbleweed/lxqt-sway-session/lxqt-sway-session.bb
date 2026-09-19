SUMMARY = "Session files for LXQt-Sway"
DESCRIPTION = "This package contains the files necessary to use Sway as the Wayland compositor \
with LXQt"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "lxqt-sway-session-0.4.1-1.2.noarch.rpm"
RPM_HASH = "0cb2b5cebbf8c69f36aa2644f54ea8d56f1f56c1a1b856989864c477e204b6ba4af51302a04d887191d4d4fa77726b4c14ab8c7ad2b1acf65dbe44c4b12222ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-sway-session"

RDEPENDS:${PN} += "lxqt-wayland-session \
sway"

inherit rpm
