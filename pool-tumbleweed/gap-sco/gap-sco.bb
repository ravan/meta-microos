SUMMARY = "GAP: Simplicial Cohomology of Orbifolds"
DESCRIPTION = "The SCO package provides functionality to compute simplicial \
cohomology of orbifolds."
LICENSE = "GPL-2.0-only"

PV = "2025.12.01"

RPM_NAME = "gap-sco-2025.12.01-1.2.noarch.rpm"
RPM_HASH = "d5cd1cd2839af7468e29583e316bf59e787806a0ecff4f022ef6eb14c445c7998487e4ed5496d72786f35623dc726294e15f7cc09c94ed47e6c130154887203e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-sco"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
gap-matricesforhomalg \
gap-modules"

inherit rpm
