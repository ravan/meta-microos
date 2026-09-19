SUMMARY = "openSUSE Branding of mate-desktop"
DESCRIPTION = "This package provides the openSUSE definition for MATE Desktop GSchemas."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "mate-desktop-gschemas-branding-openSUSE-42.1-9.6.noarch.rpm"
RPM_HASH = "c8cd6377d43c978613efcaf3589df4bfe1152cc6dad5363dd2b7fa8ddc83c114b385c676d2d27bcca66d730477fcd4002d5d58fcca8df731cff187984c834755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-desktop-gschemas-branding \
mate-desktop-gschemas-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
adwaita-icon-theme \
mate-desktop-gschemas"

inherit rpm
