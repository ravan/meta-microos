SUMMARY = "Documentation for gnuradio-osmosdr"
DESCRIPTION = "Documentation for gr-osmosdr module for GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.6"

RPM_NAME = "gr-osmosdr-doc-0.2.6-3.9.noarch.rpm"
RPM_HASH = "c411cc93fb04d8faa1835f7c43c664dc0c59381697a161c31416ff316fc39fcfa5ed6bb691ac45c48bf443f0fad43b9643afdeb4ee6373a2b3b3165333017b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-osmosdr-doc"

RDEPENDS:${PN} += "gr-osmosdr"

inherit rpm
