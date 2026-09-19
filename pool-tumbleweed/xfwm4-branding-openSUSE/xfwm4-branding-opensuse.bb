SUMMARY = "openSUSE Branding of xfwm4"
DESCRIPTION = "This package provides the openSUSE look and feel for the xfwm4 window manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.20.0+git1.d2555b3"

RPM_NAME = "xfwm4-branding-openSUSE-4.20.0+git1.d2555b3-3.10.noarch.rpm"
RPM_HASH = "744a282abcba8de7ea6b456f7600080583351cb870d0b7e1854d0dca7008ebe5ec0c0bfc0e3eeaff22d539b6b87ebafe12f1ea2a90dd2dbc28ebb0902f18356a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfwm4-branding-openSUSE \
xfwm4-branding \
xfwm4-branding-openSUSE"

RDEPENDS:${PN} += "noto-sans-fonts"

inherit rpm
