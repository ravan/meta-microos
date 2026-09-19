SUMMARY = "Additional data for the qalculator calulator library"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry. \
This provides definitions of additional units, functions, etc. on top \
of the built-in ones."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "qalculate-data-5.12.0-1.1.noarch.rpm"
RPM_HASH = "d7115cbc0979131b898dbcc196434cfcf27b07c9c80ce98175ed41bcabf6c6942d9a5eac8736047a7fda8fb08d16b976aa6c80859364d298c502faa2e1c01edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qalculate-/usr/share/qalculate/units.xml \
qalculate-data"

RDEPENDS:${PN} += "libqalculate"

inherit rpm
