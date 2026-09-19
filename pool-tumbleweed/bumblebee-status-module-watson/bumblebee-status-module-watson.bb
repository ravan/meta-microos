SUMMARY = "Displays the status of watson"
DESCRIPTION = "Displays the status of watson (time-tracking tool)."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-watson-2.1.5-4.7.noarch.rpm"
RPM_HASH = "b4a5b65cb31b52631ba5cdb8f1c72aef4f49515f014f07e87515c97c66eecd0a1a5475424df4776f026b706c7e890c7400bd1716902b2b0c1a7237de0bb5a8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-watson"

RDEPENDS:${PN} += "bumblebee-status \
watson"

inherit rpm
