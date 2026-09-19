SUMMARY = "Fish Completion for kor"
DESCRIPTION = "Fish command line completion support for kor."
LICENSE = "MIT"

PV = "0.6.8"

RPM_NAME = "kor-fish-completion-0.6.8-1.4.noarch.rpm"
RPM_HASH = "400707a3c1fb098565da6469fa5c455db9a509874cbb591dfe8a445f982a7c633df45281a26ae3fbf9a9c6d3494e74ca7b7a7b3522fb089d3a9a8be6638a4689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kor-fish-completion"

RDEPENDS:${PN} += "kor"

inherit rpm
