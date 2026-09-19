SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
Neon theme"
LICENSE = "GPL-3.0-only"

PV = "20220219.1.26"

RPM_NAME = "openSUSE-e-X-Neon-Icons-20220219.1.26-2.2.noarch.rpm"
RPM_HASH = "b8e6d2168bfb4de4be83ecb7a89d9ee1f4d4d8670a128e7abbb24056e88d64cdfd03f6fa1dc700fb5872c937aa61ad2e8e864978bf7d5ef8a4c3d307a9c9f0db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Neon-Icons"

RDEPENDS:${PN} += ""

inherit rpm
