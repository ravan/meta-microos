SUMMARY = "Icon theme inspired by Tango and Elementary"
DESCRIPTION = "This is an icon-theme maintained with Xfce in mind, \
but it supports other desktops like Gnome3 as well. \
It's a fork of the upstream elementary-project, \
which took place because the team decided to \
drop a lot of desktop-specific symlinks."
LICENSE = "GPL-3.0-only"

PV = "0.22+git0.98ad7e92"

RPM_NAME = "elementary-xfce-icon-theme-0.22+git0.98ad7e92-1.4.noarch.rpm"
RPM_HASH = "60861a4524777f917ade8971bb0af3eb64d26ff83ea7878667d590dcc4bdb56bfc4de4868ead80062c5321fca253cc78f4f7adf35ebb8fbaa0ac9885781db8b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-xfce-icon-theme"

RDEPENDS:${PN} += "adwaita-icon-theme \
gtk3-tools \
hicolor-icon-theme"

inherit rpm
