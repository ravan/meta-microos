SUMMARY = "openSUSE settings for KDE Plasma 6"
DESCRIPTION = "This package changes the default settings of Plasma 6."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20240313T170730~9c664b7"

RPM_NAME = "plasma6-branding-openSUSE-84.87~git20240313T170730~9c664b7-47.1.noarch.rpm"
RPM_HASH = "e040de52b0ebfcfaad1a384eb6ddb7a060354f881326d0bc859d72813a917fa5cd511f9725d76db9db4ada3cf066cf6a0cc7b8c47415cebc005d2ad89b28107b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-plasma6-branding-openSUSE \
plasma5-defaults-openSUSE \
plasma6-branding-openSUSE"

RDEPENDS:${PN} += "distribution-logos-openSUSE-icons \
plasma6-theme-openSUSE"

inherit rpm
