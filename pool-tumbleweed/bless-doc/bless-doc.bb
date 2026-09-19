SUMMARY = "Documentation for Bless"
DESCRIPTION = "Bless is a hex editor. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "bless-doc-0.6.3-3.3.aarch64.rpm"
RPM_HASH = "114758798d67e2f9a2cf5747438e409b405e55f23a6612524bf3444cc566f2288657663545ff37cdb692025c9167e326d3291f46ce40f13b5075564dabf216a0"

RPROVIDES:${PN} += "bless-doc"

RDEPENDS:${PN} += ""

inherit rpm
