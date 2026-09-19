SUMMARY = "The GTK+ toolkit library (version 2) -- openSUSE theme configuration"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the openSUSE theme configuration for \
widgets and icon themes."
LICENSE = "BSD-3-Clause"

PV = "15.0"

RPM_NAME = "gtk2-branding-openSUSE-15.0-2.7.noarch.rpm"
RPM_HASH = "07a4fc13787634ae95a51649732eb4e99fe21ce1216a4373e0f84695efdb993eb5e3990e49de61588189f3f6342fbb25b5e4b1db8149e87d6ec3079713270ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gtk2-branding-openSUSE \
gtk2-branding \
gtk2-branding-openSUSE"

RDEPENDS:${PN} += "gtk2-metatheme-adwaita \
libgtk-2-0-0"

inherit rpm
