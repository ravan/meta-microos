SUMMARY = "openSUSE Branding of mate-menus"
DESCRIPTION = "This package provides the openSUSE definitions for menus."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "mate-menus-branding-openSUSE-42.1-9.6.noarch.rpm"
RPM_HASH = "d185ff5589bce9d526ad375607694e2afcc4208a921be2d2e63769055dc834ac945d9b65514eefd5aabe838bd961f73ebf3a71ea91d696e95b19dc8aa07579eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mate-menus-branding-openSUSE \
mate-menus-branding \
mate-menus-branding-openSUSE"

RDEPENDS:${PN} += "mate-menus"

inherit rpm
