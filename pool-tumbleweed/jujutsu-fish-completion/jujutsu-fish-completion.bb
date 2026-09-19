SUMMARY = "Fish Completion for jujutsu"
DESCRIPTION = "Fish command line completion support for jujutsu."
LICENSE = "MIT"

PV = "0.44.0"

RPM_NAME = "jujutsu-fish-completion-0.44.0-1.2.noarch.rpm"
RPM_HASH = "06ee189760d9da0ff352bd926e31941f4d409affc0f8d357179cc9433ad5e8434261c6f71ce4286ccec33ef4e29a0aaa520bbfdfdaedd3cb861ec0c155afd930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jujutsu-fish-completion"

RDEPENDS:${PN} += "jujutsu"

inherit rpm
