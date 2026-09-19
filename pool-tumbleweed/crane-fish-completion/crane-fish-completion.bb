SUMMARY = "Fish Completion for crane"
DESCRIPTION = "Fish command line completion support for crane."
LICENSE = "Apache-2.0"

PV = "0.22.1"

RPM_NAME = "crane-fish-completion-0.22.1-1.1.noarch.rpm"
RPM_HASH = "784408d4b1e4faa8efc7bbfd1224360759aa77b1f28bf1f43276a9e57b04c86bd66e0ee446ba02b8b91aa3889a785e3206416a06a853e32f6a316b060440f688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crane-fish-completion"

RDEPENDS:${PN} += "crane"

inherit rpm
