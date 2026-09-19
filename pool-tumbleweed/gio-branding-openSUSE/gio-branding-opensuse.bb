SUMMARY = "openSUSE definitions of default settings and applications"
DESCRIPTION = "This package provides openSUSE defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "BSD-3-Clause"

PV = "42.1"

RPM_NAME = "gio-branding-openSUSE-42.1-6.17.noarch.rpm"
RPM_HASH = "4b19d0cebff6ebcd23d7316276583c08c8d4586978f02c4068d56e99b5ec436c847216b9e140f8153322cec686615c546abf72fd1206b74d19ebc6eba66bad55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gio-branding-openSUSE \
gio-branding \
gio-branding-openSUSE \
glib2-branding-openSUSE"

RDEPENDS:${PN} += "libgio-2-0-0"

inherit rpm
