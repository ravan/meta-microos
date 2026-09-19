SUMMARY = "Upstream Branding for xfce4-panel"
DESCRIPTION = "This package provides the upstream look and feel for xfce4-panel."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.8"

RPM_NAME = "xfce4-panel-branding-upstream-4.20.8-1.1.noarch.rpm"
RPM_HASH = "b3c01c78f10590256754edceb642ebbc109542958b9ff7fbe09a306ab09b503c08f62fce2c269e3511a452dd8e5c5c3bd8d18fddede0a65db8af927d79f8f703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-panel-branding-upstream \
xfce4-panel-branding \
xfce4-panel-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
