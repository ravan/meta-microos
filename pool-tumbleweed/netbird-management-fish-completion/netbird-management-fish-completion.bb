SUMMARY = "Fish Completion for netbird-management"
DESCRIPTION = "Fish command line completion support for netbird-management."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-management-fish-completion-0.78.1-1.1.noarch.rpm"
RPM_HASH = "115a67580346a25d8e63a86494b01968d78acb67733bf5f985ec5e9eefb9e86d8fbaa15dc37dbd07758963dcf16245b5e48e5f52d225ac0f77f73005caf86322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbird-management-fish-completion"

RDEPENDS:${PN} += "fish \
netbird-management"

inherit rpm
