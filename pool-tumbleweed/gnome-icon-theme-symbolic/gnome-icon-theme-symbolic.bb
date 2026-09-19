SUMMARY = "Symbolic icon theme for GNOME"
DESCRIPTION = "The purpose of this icon theme is to extend the base icon theme that \
follows the Tango style guidelines for specific purposes. This would \
include OSD messages, panel system/notification area, and possibly \
menu icons. \
 \
Icons follow the naming specification, but have a -symbolic suffix, so \
only applications specifically looking up these symbolic icons will \
render them. If a -symbolic icon is missing, the app will fall back to \
the regular name."
LICENSE = "CC-BY-SA-3.0"

PV = "3.12.0"

RPM_NAME = "gnome-icon-theme-symbolic-3.12.0-3.27.noarch.rpm"
RPM_HASH = "11edf98096662c1f780bc4f8569744ca3e68230b74a78e5f7597704dc912f9a282ec3911c62ac64328504bade791350015918e4f43a3599f63247bc6fcf5c1a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-icon-theme-symbolic \
pkgconfig-gnome-icon-theme-symbolic"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gnome-icon-theme"

inherit rpm
