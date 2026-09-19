SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the upstream theme configuration for widgets and \
icon themes."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gtk3-branding-upstream-3.24.52+git59.b30343717d-1.1.noarch.rpm"
RPM_HASH = "9066e3e67ab71ec3621ff5ef4ed2bf9d70993b74c422275098eb01d87dd807372a3869abdb0118b62b322f2b5f1276b58667aec6e512be5d7a60e7217b2ba1dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gtk3-branding-upstream \
gtk3-branding \
gtk3-branding-upstream"

RDEPENDS:${PN} += "libgtk-3-0"

inherit rpm
