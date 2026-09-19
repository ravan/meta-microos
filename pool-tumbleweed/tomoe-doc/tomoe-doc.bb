SUMMARY = "Documentation for the Tomoe handwriting recognition engine"
DESCRIPTION = "Japanese handwriting recognition engine (Tegaki Online MOji-ninshiki \
Engine)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-doc-0.6.0-51.18.aarch64.rpm"
RPM_HASH = "c09b33859bd776bf14e088484fd94fa1350bc698cf35eb662446a2122927f81494377c1a00bdd7848812ab88fa47b1113ba22148a6a9903d1ec5a5b7e71884e7"

RPROVIDES:${PN} += "tomoe-doc"

RDEPENDS:${PN} += ""

inherit rpm
