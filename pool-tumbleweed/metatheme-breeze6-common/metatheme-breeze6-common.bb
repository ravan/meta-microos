SUMMARY = "GTK+ theme matching KDE's Breeze -- Common Files"
DESCRIPTION = "A GTK+ theme created to match with the Plasma 6 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "6.7.5"

RPM_NAME = "metatheme-breeze6-common-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "9a78b39822712ed30edd4bc49809945a8374519db605cfecacc9f3987c233e56daa9c1a2a0323dc47efa9c25bcb2823d952461100fb447e01e37577a75683ec3"

RPROVIDES:${PN} += "breeze-gtk \
metatheme-breeze-common \
metatheme-breeze6-common"

RDEPENDS:${PN} += ""

inherit rpm
