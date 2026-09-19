SUMMARY = "Upstream Branding of xfce4-settings"
DESCRIPTION = "This package provides the upstream look and feel for xfce4-settings."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.20.5"

RPM_NAME = "xfce4-settings-branding-upstream-4.20.5-1.1.noarch.rpm"
RPM_HASH = "e0f2d80973cacb62033639df3ceaa9a51ee8ea9a9b89224d3c52f6fd7525a45d66fa882543e382d057a7d2a874eac027faddd29d82fb8f99879467cdd123ca79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-settings-branding-upstream \
xfce4-settings-branding \
xfce4-settings-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
