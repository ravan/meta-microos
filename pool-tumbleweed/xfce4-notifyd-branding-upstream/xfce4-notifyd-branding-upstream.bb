SUMMARY = "Upstream Branding of xfce4-notifyd"
DESCRIPTION = "This package provides the upstream look and feel for the Xfce Notification Daemon."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "xfce4-notifyd-branding-upstream-0.9.7-1.7.noarch.rpm"
RPM_HASH = "5c997dc75ddd9b67df142c2696fa5977b1f1b206ee25f7fbdbbf67aefbdedafa70fa43b50890de927d4da6e184475971752f41ddfe547928e52dedf5535be939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-notifyd-branding-upstream \
xfce4-notifyd-branding \
xfce4-notifyd-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
