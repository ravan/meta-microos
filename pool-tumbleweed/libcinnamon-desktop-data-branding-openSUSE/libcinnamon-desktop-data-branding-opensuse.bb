SUMMARY = "openSUSE Branding of the Cinnamon Desktop Environment"
DESCRIPTION = "This package provides the openSUSE look and feel for the Cinnamon \
desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "42.2"

RPM_NAME = "libcinnamon-desktop-data-branding-openSUSE-42.2-1.6.noarch.rpm"
RPM_HASH = "f376b5e057f6eb9e0b4b316df6062a19a2ec95abfeed092a1222d6df9b0be9f414bd48e8540cb14de643591d64c0c8b82eb0192f770e25fc2ffdc656d53b84a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcinnamon-desktop-data-branding \
libcinnamon-desktop-data-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
adwaita-icon-theme \
libcinnamon-desktop-data \
wallpaper-branding-openSUSE"

inherit rpm
