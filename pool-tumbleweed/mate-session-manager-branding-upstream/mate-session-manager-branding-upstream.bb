SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-session-manager-branding-upstream-1.28.0-1.13.noarch.rpm"
RPM_HASH = "090c7c627c07c17d2f4d67dee7b9ad61a9f0c50382d5d7b949850b6740474959012f25d05842434000aa4699aca396303f6ebbf39ce8f83e657f06f19b03af23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mate-session-manager-branding-upstream \
mate-session-manager-branding \
mate-session-manager-branding-upstream"

RDEPENDS:${PN} += "mate-session-manager"

inherit rpm
