SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 2 Support"
DESCRIPTION = "A GTK+ theme created to match with the Plasma 6 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "6.7.5"

RPM_NAME = "gtk2-metatheme-breeze6-6.7.5-1.1.noarch.rpm"
RPM_HASH = "624f384ccb79ea64ebabd05412e65fda9f7e6c3d4a8576defefc52d68b522c2f1ff10845db009ecfe887070bec38e0650cb5b3cc96f92a2a2a4cbfc25b8bc6b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-breeze \
gtk2-metatheme-breeze6"

RDEPENDS:${PN} += "metatheme-breeze6-common"

inherit rpm
