SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the upstream theme configuration for widgets and \
icon themes."
LICENSE = "LGPL-2.1-or-later"

PV = "4.22.5"

RPM_NAME = "gtk4-branding-upstream-4.22.5-1.1.noarch.rpm"
RPM_HASH = "722973fc55a6e974a58567bd4b2122267d325cb7a8c05ba06cbf2d864606b6260cb191b1a4eda5756e834f346fce7a6cfe5b302fa388801922381e403c42be7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-branding \
gtk4-branding-upstream"

RDEPENDS:${PN} += "libgtk-4-1"

inherit rpm
