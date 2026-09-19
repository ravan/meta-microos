SUMMARY = "Development files for Judy"
DESCRIPTION = "This package holds the development files for Judy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "judy-devel-1.0.5-11.9.aarch64.rpm"
RPM_HASH = "261c22739a9fdac8dea99f8acbf2bbe85d5503594ef30a32330f712f307654a906901aef1e1571d756d45a09da55aa134034e2dfb65d340acc3fdce5b7a7c129"

RPROVIDES:${PN} += "judy-devel"

RDEPENDS:${PN} += "libJudy1"

inherit rpm
