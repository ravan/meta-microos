SUMMARY = "The GTK+ toolkit library (version 3) -- openSUSE theme configuration"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the openSUSE theme configuration for \
widgets and icon themes."
LICENSE = "BSD-3-Clause"

PV = "15.0"

RPM_NAME = "gtk3-branding-openSUSE-15.0-2.19.noarch.rpm"
RPM_HASH = "dc1c6cf07b8b19d5ebd62c0bae1f6018bad31ccecc379cf1de50e1448782a270a3b6200b9e0b88cc854538d4e8306a00a1ff9afe3553d10c1a6e0f2def46f2a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gtk3-branding-openSUSE \
gtk3-branding \
gtk3-branding-openSUSE"

RDEPENDS:${PN} += "gtk3-metatheme-adwaita \
libgtk-3-0"

inherit rpm
