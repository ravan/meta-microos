SUMMARY = "openSUSE Branding of xfdesktop"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Desktop Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.20.0+git1.d2555b3"

RPM_NAME = "xfdesktop-branding-openSUSE-4.20.0+git1.d2555b3-3.10.noarch.rpm"
RPM_HASH = "cd43ec8308108dfe4a03cd5e6d64f0f0dfc2a8d437dc7cebc5dbb18979100a2d762da2aac2602f35c829fa8c700920ec44dba00bc554e4820b2d4f1781bcf278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfdesktop-branding-openSUSE \
xfce4-desktop-branding-openSUSE \
xfdesktop-branding \
xfdesktop-branding-openSUSE"

RDEPENDS:${PN} += "desktop-data-openSUSE \
wallpaper-branding"

inherit rpm
