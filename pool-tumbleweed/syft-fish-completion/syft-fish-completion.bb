SUMMARY = "Fish Completion for syft"
DESCRIPTION = "Fish command line completion support for syft."
LICENSE = "Apache-2.0"

PV = "1.51.1"

RPM_NAME = "syft-fish-completion-1.51.1-1.1.noarch.rpm"
RPM_HASH = "799a927fbb593a3a4b6e6e1d5b852061c1486050b5e63433c18a2e26ab6f945396bb3316f99879742049004d9394cfbdac0fb7178b770770a87f3a181ab1fa35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "syft-fish-completion"

RDEPENDS:${PN} += "syft"

inherit rpm
