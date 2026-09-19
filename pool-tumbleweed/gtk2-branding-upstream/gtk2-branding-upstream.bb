SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-branding-upstream-2.24.33-18.7.noarch.rpm"
RPM_HASH = "353ee11990ca9e47ec9e76a353e3ca9b626c6e80e193d11f5ebae73e8a3e4f56b6a0e091ef319982248e4ab06ca28e21aeafbed707425550a5d354980a25f8fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gtk2-branding-upstream \
gtk2-branding \
gtk2-branding-upstream"

RDEPENDS:${PN} += "libgtk-2-0-0"

inherit rpm
