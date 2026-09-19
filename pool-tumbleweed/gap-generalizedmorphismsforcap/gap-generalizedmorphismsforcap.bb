SUMMARY = "GAP: Implementations of generalized morphisms for the CAP project"
DESCRIPTION = "This package provides implementations of generalized morphisms for \
the CAP module in GAP."
LICENSE = "GPL-2.0-or-later"

PV = "2025.12.01"

RPM_NAME = "gap-generalizedmorphismsforcap-2025.12.01-1.2.aarch64.rpm"
RPM_HASH = "aa8fbff42aec135e2944058ec0fbce4fe2d8dec5f7bf00202a3f86d544164ffd435d5adfd1260ad4963a949cfff48317cf92e5a3ac9e038691485b2ec19a5f5d"

RPROVIDES:${PN} += "gap-generalizedmorphismsforcap"

RDEPENDS:${PN} += "gap-cap \
gap-core \
gap-gapdoc \
gap-monoidalcategories"

inherit rpm
