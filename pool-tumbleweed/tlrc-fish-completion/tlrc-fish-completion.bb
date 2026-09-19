SUMMARY = "Fish Completion for tlrc"
DESCRIPTION = "Fish command-line completion support for tlrc."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "tlrc-fish-completion-1.13.1-1.4.noarch.rpm"
RPM_HASH = "847fe56889e6573062adfc54334b3aaaf8ca804ee6111454bdc45c20002ed2dd1ec7fd88b68d3b8a759471e326be4beaafee035b6ee340382f5ba91fc7e2db19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlrc-fish-completion"

RDEPENDS:${PN} += "fish \
tlrc"

inherit rpm
