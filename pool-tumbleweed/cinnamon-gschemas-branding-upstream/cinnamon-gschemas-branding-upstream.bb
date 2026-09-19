SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "6.4.6"

RPM_NAME = "cinnamon-gschemas-branding-upstream-6.4.6-3.6.noarch.rpm"
RPM_HASH = "6236044d6e30a22e87c468c4805343720763f01eeebe12508d6daa8a0a6f859ab5bcc3baae6709e61387844b13b8053e9e8db8f392c964d84b8dcad16eaec3c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-branding-upstream \
cinnamon-gschemas-branding \
cinnamon-gschemas-branding-upstream"

RDEPENDS:${PN} += "cinnamon-gschemas"

inherit rpm
