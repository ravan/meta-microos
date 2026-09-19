SUMMARY = "The KDE Plasma Workspace Cursors"
DESCRIPTION = "This package contains the Oxygen cursor set."
LICENSE = "GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "oxygen6-cursors-6.7.5-1.1.noarch.rpm"
RPM_HASH = "b6e7f87a6c2d155a0cd7b42e12fe0ab32993855900502f5aab5de8618723549f02865182c8394d538ea7aa20fd1191025f66f22121db98d95035017e6594818e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-cursors \
oxygen-cursors4 \
oxygen-cursors5 \
oxygen4-cursors \
oxygen5-cursors \
oxygen6-cursors"

RDEPENDS:${PN} += ""

inherit rpm
