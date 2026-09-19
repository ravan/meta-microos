SUMMARY = "openSUSE Branding of mate-session-manager"
DESCRIPTION = "This package provides the openSUSE look and feel for the MATE Session Manager."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "mate-session-manager-branding-openSUSE-42.1-9.6.noarch.rpm"
RPM_HASH = "33b188049b51c268036f1e8213ffe9cc3f2431548edcd0c52ff6d281c1aee3f6973b2303314465156988a052e8c9d94975ee5849fcb88e40c7536639a5e3e2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mate-session-manager-branding-openSUSE \
mate-session-manager-branding \
mate-session-manager-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
mate-icon-theme \
mate-session-manager \
metatheme-numix-common \
wallpaper-branding-openSUSE"

inherit rpm
