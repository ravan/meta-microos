SUMMARY = "A freedesktop.org compatible icon theme"
DESCRIPTION = "Setting this icon theme as your application icon theme in enlightenment will \
make all your applications use the same icon set as the enlightenment \
Flat (upstream) theme. \
 \
Icon themes to match the openSUSE Enlightenment themes are also available."
LICENSE = "GPL-3.0-only"

PV = "0.21.0"

RPM_NAME = "enlightenment-x-Flat-icon-theme-0.21.0-37.1.aarch64.rpm"
RPM_HASH = "240116f62b1130cab407ca1294b76bb680a590bc973e446a6a0c987bacf27fd3458756baf0220d260733fad8e8f699c1d7b874fa3fa8219e1bdad0ad20a11145"

RPROVIDES:${PN} += "enlightenment-x-Flat-icon-theme"

RDEPENDS:${PN} += ""

inherit rpm
