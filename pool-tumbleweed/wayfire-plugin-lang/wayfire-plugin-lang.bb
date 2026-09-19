SUMMARY = "Translations for package wayfire-plugin"
DESCRIPTION = "Provides translations for the 'wayfire-plugin' package."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "wayfire-plugin-lang-0.11.0-1.1.noarch.rpm"
RPM_HASH = "958a45512ec8fe15c15fcf45c43b5ba2e1f19ec608c22329d030bd993643b837a396617cd54fef9a434a7fbae6749ccce6ee201df96c5faa72fac98454eb9ad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wayfire-plugin-ro \
wayfire-plugin-lang \
wayfire-plugin-lang-all"

RDEPENDS:${PN} += "wayfire-plugin"

inherit rpm
