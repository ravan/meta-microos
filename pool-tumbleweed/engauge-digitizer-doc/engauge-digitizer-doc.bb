SUMMARY = "Documentation for Engauge Digitizer"
DESCRIPTION = "This package contains the documentation for Engauge Digitizer."
LICENSE = "GPL-2.0-or-later"

PV = "12.9.1"

RPM_NAME = "engauge-digitizer-doc-12.9.1-2.2.noarch.rpm"
RPM_HASH = "902a060b2ac6f1eb4ff3fee8b44902c9a34fd3ff149db7b29bdd4784e921752102ae1320b3aea600596c4cf4e90ce92a46cd7684e693529162aaaf890e7eda9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "engauge-digitizer-doc"

RDEPENDS:${PN} += "engauge-digitizer"

inherit rpm
