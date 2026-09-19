SUMMARY = "Soutzoe input schema for rime"
DESCRIPTION = "soutzoe input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-soutzoe-20250315-1.4.noarch.rpm"
RPM_HASH = "29023f7cc256ff0d968f7e86f390ffd43cd814c42f9b1b0bf2561f661f6c902ba2e25524d2df669e0d9c670d043137ab809d3f1bf2006e33198998b07d3dc9c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-soutzoe"

RDEPENDS:${PN} += ""

inherit rpm
