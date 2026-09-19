SUMMARY = "openSUSE Branding of the Cinnamon Desktop Environment"
DESCRIPTION = "This package provides the openSUSE look and feel for the Cinnamon \
desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "42.2"

RPM_NAME = "cinnamon-gschemas-branding-openSUSE-42.2-1.6.noarch.rpm"
RPM_HASH = "78ee5f953a0e34253546f0fcff591a420d061b13694ff55eb9dcc9cd59a49059a3d480c4839e8f27e219785d3ea6ea21ba1d2081deab9bb85d77a7adf11a9ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-branding-openSUSE \
cinnamon-gschemas-branding \
cinnamon-gschemas-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
cinnamon-gschemas \
cinnamon-themes \
libgnomesu"

inherit rpm
