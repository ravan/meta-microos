SUMMARY = "Documentation for ASCO"
DESCRIPTION = "ASCO brings circuit optimization capabilities to existing SPICE \
simulators using a parallel differential evolution (DE) optimization \
algorithm. Currently, out-of-the-box support for Eldo, HSPICE, LTspice, \
Spectre, Qucs and ngspice exist. \
 \
This package provides documentation for ASCO in PDF format."
LICENSE = "GPL-2.0-only"

PV = "0.4.11"

RPM_NAME = "asco-doc-0.4.11-3.9.noarch.rpm"
RPM_HASH = "29371ef1f08b5eccb769dc51e31117c790422380b8a92773edac32b00d1a8b4dd2e3908fc97d66fd48d52912f743c8fd8ac5d20c0da23572273fe917ccb99c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asco-doc"

RDEPENDS:${PN} += ""

inherit rpm
