SUMMARY = "Docs for NsCDE"
DESCRIPTION = "Docs for NsCDE."
LICENSE = "GPL-3.0-only"

PV = "2.3"

RPM_NAME = "NsCDE-doc-2.3-1.8.noarch.rpm"
RPM_HASH = "937b1117bf4d2770977f1a4db9c45273738fa3d5d8ad51d86e7cd3fc5d418615f8dbc2476b4be674c5b6ebe786007263274b21f097fc1d1d90a9f1c83c9e8f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NsCDE-doc"

RDEPENDS:${PN} += "/usr/bin/ksh"

inherit rpm
