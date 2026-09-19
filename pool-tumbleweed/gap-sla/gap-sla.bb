SUMMARY = "GAP: Computations with simple Lie algebras"
DESCRIPTION = "The package SLA contains functionality for working with simple Lie algebras."
LICENSE = "GPL-2.0+"

PV = "1.6.2"

RPM_NAME = "gap-sla-1.6.2-1.6.noarch.rpm"
RPM_HASH = "20aaacde91378270b9e1d1c8a63d16a6377a510e04842b2823229ccdde8481c407df333a3b6ca365be98460bb764dfea894d93c1d11ed0e865f1715196afb0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-sla"

RDEPENDS:${PN} += "gap-core \
gap-quagroup"

inherit rpm
