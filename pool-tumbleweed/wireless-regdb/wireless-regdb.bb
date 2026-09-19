SUMMARY = "802.11 regulatory domain database"
DESCRIPTION = "The 802.11 regulatory domain database is used by CRDA and provides allowed \
frequency ranges for 802.11 wireless drivers."
LICENSE = "ISC"

PV = "20260903"

RPM_NAME = "wireless-regdb-20260903-1.1.noarch.rpm"
RPM_HASH = "01c087d9a25890d19a439e3130e19108666a656ffc68b5c314b2dfb77e02b3e2ae12ec623b1e5c9346f318eb7f09dc6caf6de1ad9eac67759926357a33466ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-regulatory.db \
firmware-regulatory.db.p7s \
wireless-regdb"

RDEPENDS:${PN} += ""

inherit rpm
