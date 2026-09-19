SUMMARY = "GAP: Category of Matrices over a Field for CAP"
DESCRIPTION = "This package adds support for categories of matrices over a field \
for CAP."
LICENSE = "GPL-2.0-or-later"

PV = "2026.05.04"

RPM_NAME = "gap-linearalgebraforcap-2026.05.04-1.2.aarch64.rpm"
RPM_HASH = "3f1b029ca5d19f42f6dfe0bf72a3ed7ee7ddfe57a8c89c10fb37a35bbf41ec6839f28481862dacfb736c52e6a8c33f25605638b9d23d03babb3cc133789a6340"

RPROVIDES:${PN} += "gap-linearalgebraforcap"

RDEPENDS:${PN} += "gap-cap \
gap-core \
gap-gaussforhomalg \
gap-matricesforhomalg \
gap-monoidalcategories \
gap-toolsforhomalg"

inherit rpm
