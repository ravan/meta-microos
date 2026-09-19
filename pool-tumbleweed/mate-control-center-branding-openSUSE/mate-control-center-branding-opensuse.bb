SUMMARY = "openSUSE Branding of mate-control-center"
DESCRIPTION = "This package provides the openSUSE definition of what appears in the \
control centre."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "mate-control-center-branding-openSUSE-42.1-9.6.noarch.rpm"
RPM_HASH = "1697e0cde17569132871bc927fb031168ca249c657716c0777ab0a42e14193e505c97e2c5fc4a39f10714b2151ee51ef6dc70bf92ee403d7fd0d35476377e562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mate-control-center-branding-openSUSE \
mate-control-center-branding \
mate-control-center-branding-openSUSE"

RDEPENDS:${PN} += "mate-control-center"

inherit rpm
