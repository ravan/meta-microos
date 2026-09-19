SUMMARY = "Salt modules and states for SAP Applications and SLE-HA components management"
DESCRIPTION = "Salt modules and states for SAP Applications and SLE-HA components management"
LICENSE = "Apache-2.0"

PV = "0.3.19+git.1757602235.33fff4c"

RPM_NAME = "salt-shaptools-0.3.19+git.1757602235.33fff4c-1.3.noarch.rpm"
RPM_HASH = "ac37c661055765981a57e8f85d7d76680c7dadf903825d7b7542b0681f81973f7860d06505516c509dd21f7df91ec648a7e7f6192635cdcb70cda121a5491054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "salt-shaptools"

RDEPENDS:${PN} += "group-salt \
python3-six"

inherit rpm
