SUMMARY = "GAP: Extended Gauss Functionality for GAP"
DESCRIPTION = "The GAP Gauss package provides algorithms to compute reduced row \
echelon forms (RREF) of a matrix."
LICENSE = "GPL-2.0-or-later"

PV = "2025.12.01"

RPM_NAME = "gap-gauss-2025.12.01-1.3.aarch64.rpm"
RPM_HASH = "912d19a9856edc8de2ebc8db4a46c8b9cc7d1f834c513d4c4875c722e88e66a11ea4d9522a40b6b2cb3343aec1b031b5837e1c3bdfeb715662e8f70f5b80fea9"

RPROVIDES:${PN} += "gap-gauss"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core"

inherit rpm
