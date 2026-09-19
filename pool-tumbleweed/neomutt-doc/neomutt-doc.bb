SUMMARY = "Additional documentation for neomutt"
DESCRIPTION = "Documentation for NeoMutt with neomuttrc examples for different environments \
and requirements."
LICENSE = "GPL-2.0-or-later"

PV = "20260406"

RPM_NAME = "neomutt-doc-20260406-1.4.noarch.rpm"
RPM_HASH = "dbaed4a685b197cd5c3fac170dd6a1ec8d9a3f1782a9a29dffb408e1920b90ecaef1e0ebeeea2a69ca076939ef7f54bc5b33f7544cb321f42b5985515bb4d745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neomutt-doc"

RDEPENDS:${PN} += "neomutt"

inherit rpm
