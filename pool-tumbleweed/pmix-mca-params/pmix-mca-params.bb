SUMMARY = "Settings for the Module Component Architecure"
DESCRIPTION = "PMIX is part of the Module Component Architecure and needs so to have its \
parameters configured."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "pmix-mca-params-3.2.5-2.10.noarch.rpm"
RPM_HASH = "97778b0b1ae6545afcb47af879a06fc8eb3eb3cd2825b0b352800fc024f63ff21d2a4ad081d6cc7ae7da88813acc00f9a5da1bb3c5b59c84d370dea9b9dea96a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pmix-mca-params \
pmix-mca-params \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
