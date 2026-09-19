SUMMARY = "Fish Completion for netbird-signal"
DESCRIPTION = "Fish command line completion support for netbird-signal."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-signal-fish-completion-0.78.1-1.1.noarch.rpm"
RPM_HASH = "5b6eeca992284a71c9cbb892cb4c9fd3456f324f3316de1ec336fba33e5b3d61e78cabbb3fb33b16195096ed2663497de540f911977fa3f86a4a079dcff28512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbird-signal-fish-completion"

RDEPENDS:${PN} += "fish \
netbird-signal"

inherit rpm
