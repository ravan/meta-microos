SUMMARY = "Fish Completion for digger-cli"
DESCRIPTION = "Fish command line completion support for digger-cli."
LICENSE = "Apache-2.0"

PV = "0.6.149"

RPM_NAME = "digger-cli-fish-completion-0.6.149-1.1.noarch.rpm"
RPM_HASH = "77ec7df4f790d2a706cbfbcb1801ac6d8b30f83f3722a7ae38a6cbcdb67598cbc43429c8c56944e54851c3cfc19be6a0414313fa741462a9212441ae05063dd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "digger-cli-fish-completion"

RDEPENDS:${PN} += "digger-cli"

inherit rpm
