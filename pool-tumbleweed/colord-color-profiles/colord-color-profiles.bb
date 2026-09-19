SUMMARY = "Color profiles for colord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides color profiles previously provided by shared-color-profiles"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.8"

RPM_NAME = "colord-color-profiles-1.4.8-3.1.noarch.rpm"
RPM_HASH = "6bda1a9a27c4b8698dbfbd9a7974d856aaeaec0d69afb00018219297b0de6992da5878154626adae241023ba8bdd05598e475bdf1a5ebd344d4d1f836b7ad366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-color-profiles \
shared-color-profiles"

RDEPENDS:${PN} += ""

inherit rpm
