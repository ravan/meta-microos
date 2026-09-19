SUMMARY = "openSUSE Branding of xfce4-panel"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Panel."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.20.0+git1.d2555b3"

RPM_NAME = "xfce4-panel-branding-openSUSE-4.20.0+git1.d2555b3-3.10.noarch.rpm"
RPM_HASH = "8f0827ee37ab7691e9689f3202bfd7138507b667cc16831626171b771d03b148602550881b39693b32a0e9e5cd2a2928e5b84b61c6d12177a06f7f8a06adaeec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-panel-branding-openSUSE \
xfce4-panel-branding \
xfce4-panel-branding-openSUSE"

RDEPENDS:${PN} += "xfce4-panel-plugin-whiskermenu"

inherit rpm
