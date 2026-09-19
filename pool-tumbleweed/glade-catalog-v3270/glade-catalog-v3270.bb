SUMMARY = "Glade catalog for the TN3270 terminal emulator library"
DESCRIPTION = "This package provides a catalog for Glade to allow the use of V3270 \
widgets in Glade."
LICENSE = "LGPL-3.0-only"

PV = "5.5.0+git20241211"

RPM_NAME = "glade-catalog-v3270-5.5.0+git20241211-2.8.aarch64.rpm"
RPM_HASH = "6e2af4afaf34ad0b879f8f62ddefbed70f4c304cd25967da324a10539a307951769758b01f89942c3e79a6e8932888697ca7b47e75bc6a48f4187365c8ba5c26"

RPROVIDES:${PN} += "glade-catalog-v3270"

RDEPENDS:${PN} += "glade"

inherit rpm
