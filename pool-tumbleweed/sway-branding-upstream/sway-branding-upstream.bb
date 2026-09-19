SUMMARY = "Upstream branding of sway"
DESCRIPTION = "This package provides the upstream look and feel for sway."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "sway-branding-upstream-1.12-12.3.noarch.rpm"
RPM_HASH = "56323a04a78e4c0d659546c32ec66d646342e8c11819ce68c94cb5ebe7afb215136f941aa180102c46ee21076bdd1fd643255ca9b924ee6f86ab6214b6a2a01c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sway-branding-upstream \
sway-branding \
sway-branding-upstream"

RDEPENDS:${PN} += "/usr/bin/sh \
sway \
sway-xkb-layout-generator"

inherit rpm
