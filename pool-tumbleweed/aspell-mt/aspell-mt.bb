SUMMARY = "Maltese (Malti) Dictionary for Aspell"
DESCRIPTION = "A Maltese (Malti) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50"

RPM_NAME = "aspell-mt-0.50-4.7.aarch64.rpm"
RPM_HASH = "9c56d7cbb767a40060b24e71fbb697466fe29558d5514f1dfe4bd5c32fd7d258861cd9de7a7304cae0cc9879034677a8368b4353ced7d63c3ed560f0656c4181"

RPROVIDES:${PN} += "aspell-mt \
locale-aspell-mt"

RDEPENDS:${PN} += ""

inherit rpm
