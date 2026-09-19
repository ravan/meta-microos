SUMMARY = "Default version of nodejs"
DESCRIPTION = "Depends on the most current and recommended version of nodejs for \
the current architecture and codestream."
LICENSE = "MIT"

PV = "6.1"

RPM_NAME = "nodejs-default-6.1-5.3.aarch64.rpm"
RPM_HASH = "efc4c611a8f5363a075dc3a91bdee6f043d7fd7763d64e45a2a24025889b94b05bdf77964d1bd5c430c68995f40b8b9fa697b6cd2a267944875d517456933a3e"

RPROVIDES:${PN} += "nodejs \
nodejs-default \
nodejs-engine"

RDEPENDS:${PN} += "nodejs-common \
nodejs24"

inherit rpm
