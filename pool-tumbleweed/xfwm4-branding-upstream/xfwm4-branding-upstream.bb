SUMMARY = "Upstream Branding of xfwm4"
DESCRIPTION = "This package provides the upstream look and feel for the xfwm4 window manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "xfwm4-branding-upstream-4.20.0-1.8.noarch.rpm"
RPM_HASH = "ec8f742cf2b48b4dc899f031e79e61f57a706e01af0e5f19ac6bc6c831b8b075385409dee85a70388877ed68b2c8d81d0dd3f03dd08ce352bd52baaea3c46af7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfwm4-branding-upstream \
xfwm4-branding \
xfwm4-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
