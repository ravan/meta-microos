SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "gio-branding-upstream-2.88.3-1.1.noarch.rpm"
RPM_HASH = "88df64d1db243d0a2d68f7901d75de1b250ee5d2c65b9d69f157fdfa33c3f5c3579f00b729eaf82c9208505ec0aac3cfa9ddd954cd51c43dfcbcb5731c8186bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gio-branding-upstream \
gio-branding \
gio-branding-upstream \
glib2-branding-upstream"

RDEPENDS:${PN} += "libgio-2-0-0"

inherit rpm
