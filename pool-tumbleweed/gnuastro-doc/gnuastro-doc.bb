SUMMARY = "Documentation for the GNU Astromomy Utilities"
DESCRIPTION = "Additional documentation for the GNU Astromomy Utilities."
LICENSE = "GPL-3.0-or-later"

PV = "0.24"

RPM_NAME = "gnuastro-doc-0.24-1.5.noarch.rpm"
RPM_HASH = "4d101a456d8d2633e2f39566c49ada8c3db93eb97e95bf54e9e79f9e23d9cfc1c4c1a58cf6f57f2c7c787d97cfffcc64de5303b6be822ce2ebc96137dcc65d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuastro-doc"

RDEPENDS:${PN} += ""

inherit rpm
