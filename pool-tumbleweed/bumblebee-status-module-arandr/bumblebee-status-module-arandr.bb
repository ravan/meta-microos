SUMMARY = "Enables handy interaction with arandr for display management"
DESCRIPTION = "Enables handy interaction with arandr for display management."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-arandr-2.1.5-4.7.noarch.rpm"
RPM_HASH = "b3c5f62ff6a7280b73841b4e49f1cfc2dbfa8f6ff2e90be0c24e5b98eae637767a491427e4249ce4f195a9ae47a4bb22606cc07f52dae18214d648ffe99c98ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-arandr"

RDEPENDS:${PN} += "arandr \
bumblebee-status"

inherit rpm
