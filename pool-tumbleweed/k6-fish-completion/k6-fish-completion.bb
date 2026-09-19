SUMMARY = "Fish Completion for k6"
DESCRIPTION = "Fish command line completion support for k6."
LICENSE = "AGPL-3.0"

PV = "2.1.0"

RPM_NAME = "k6-fish-completion-2.1.0-1.3.noarch.rpm"
RPM_HASH = "e85a2f4baf4608cc77320404efa1dc0d8ac1b8480060428f19c095c94bb74800af673c558fa73b0f6487905e2c867767a142a9112133b063d3af378a1a5809ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k6-fish-completion"

RDEPENDS:${PN} += "k6"

inherit rpm
