SUMMARY = "Fish Completion for awww"
DESCRIPTION = "Fish command-line completion support for awww."
LICENSE = "GPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "awww-fish-completion-0.12.0-1.5.noarch.rpm"
RPM_HASH = "9d70a481bc74519036ef92831efd2df068e948ca849d3476e5057b199a55cc08dc88042abb40489bb5387fac3ca5f4b9749c3157080c847b14e98b3b897ca344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awww-fish-completion \
swww-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
