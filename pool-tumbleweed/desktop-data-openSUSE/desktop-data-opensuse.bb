SUMMARY = "Shared Desktop Files for openSUSE"
DESCRIPTION = "This package contains shared desktop files, like the default \
applications menu structure."
LICENSE = "GPL-2.0-or-later"

PV = "15.2.20200107"

RPM_NAME = "desktop-data-openSUSE-15.2.20200107-3.2.noarch.rpm"
RPM_HASH = "759525ff2eb7dae513787753daa0d62ad7541e10abe101abbb8407e9c6fa4cbe1c40638076e4399b1214db36ed487ac8456e1f7f80df7ddb23e7e1ce25344051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-desktop-data-openSUSE \
desktop-branding \
desktop-data \
desktop-data-openSUSE \
desktop-data-openSUSE-extra"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
hicolor-icon-theme \
wallpaper-branding"

inherit rpm
