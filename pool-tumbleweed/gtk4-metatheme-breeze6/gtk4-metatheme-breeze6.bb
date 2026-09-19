SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 4 Support"
DESCRIPTION = "A GTK+ theme created to match with the Plasma 6 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "6.7.5"

RPM_NAME = "gtk4-metatheme-breeze6-6.7.5-1.1.noarch.rpm"
RPM_HASH = "3a8bc6bb233ff01ea207d1ab7fd8ad30f08b09c7c79cc06c2ce8f5a1e4b296a561ae9615d88a829b07b354b781a6d95a4dcc1c86d912869576522406acb14f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-breeze \
gtk4-metatheme-breeze6"

RDEPENDS:${PN} += "metatheme-breeze6-common"

inherit rpm
