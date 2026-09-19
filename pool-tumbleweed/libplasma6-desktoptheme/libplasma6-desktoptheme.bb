SUMMARY = "Desktop theme files usable by Plasma 5 and Plasma 6"
DESCRIPTION = "Desktop themes usable by both plasma 5 and plasma 6."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libplasma6-desktoptheme-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "decc6bf8aa6415dfae2ba36d2f791dd657245e74e895fc548a89eef8579e3799288879c0bbb221339656ea5cbe05d78d26bb563475374e3d8a81650bef966abe"

RPROVIDES:${PN} += "libplasma6-desktoptheme \
plasma-framework-desktoptheme \
plasma6-framework-desktoptheme"

RDEPENDS:${PN} += ""

inherit rpm
