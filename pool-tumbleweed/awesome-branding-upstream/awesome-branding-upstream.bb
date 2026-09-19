SUMMARY = "Upstream Branding for awesome"
DESCRIPTION = "This package provides the upstream look and feel for awesome."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "awesome-branding-upstream-4.3-6.4.noarch.rpm"
RPM_HASH = "5479caae8163d8d5d2d13f1a9d2f3fa09d9a3623269add7a92416ac7fe859965b410571ebb2cd61a599b6e9a2573bf984bea1c8ff6797b6b45e6981c21e23932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-branding \
awesome-branding-upstream \
config-awesome-branding-upstream"

RDEPENDS:${PN} += "awesome"

inherit rpm
