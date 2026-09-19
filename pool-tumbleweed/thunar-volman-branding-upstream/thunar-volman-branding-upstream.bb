SUMMARY = "Upstream Branding of thunar-volman"
DESCRIPTION = "This package provides the upstream look and feel for the Thunar Volume Manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "thunar-volman-branding-upstream-4.20.0-1.7.noarch.rpm"
RPM_HASH = "2b1988b7d1013ebdaaac5cbe0ca654a74feef3fb8234fd3c08ffb092a4f5b9724bb42264213d0b950dd778b43b68e6a954c96215b71fc1fd038db789377fb0a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-thunar-volman-branding-upstream \
thunar-volman-branding \
thunar-volman-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
