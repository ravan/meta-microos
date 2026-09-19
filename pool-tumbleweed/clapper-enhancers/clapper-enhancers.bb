SUMMARY = "Plugins enhancing Clapper library capabilities"
DESCRIPTION = "Plugins enhancing Clapper library capabilities"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-enhancers-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "19c7702d5769ad727c7130a53167a20a2e10d8a26b12df0404a75049adcd5b119e62b450870fdcff6edbf5cc60952de2b55e1e4132cc2413d0bde04c7b3d4851"

RPROVIDES:${PN} += "clapper-enhancers"

RDEPENDS:${PN} += ""

inherit rpm
