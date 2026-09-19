SUMMARY = "openSUSE theme for Enlightenment"
DESCRIPTION = "openSUSE, theme for Enlightenment"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-neon-20220219.1.26-2.2.noarch.rpm"
RPM_HASH = "d4b5901a5ecb6ecfc6ac0a7fa004ff1640a5d19e3f2c5e3c0e81e1bc286f34d799a33f696336e6fe7fd217045d53b2f7eb0bf56b5ac523cf9f353f627cab9d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-openSUSE-neon"

RDEPENDS:${PN} += ""

inherit rpm
