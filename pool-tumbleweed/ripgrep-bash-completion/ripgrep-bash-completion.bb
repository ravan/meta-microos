SUMMARY = "Bash Completion for ripgrep"
DESCRIPTION = "The official bash completion script for ripgrep, generated during the build."
LICENSE = "MIT & Unlicense"

PV = "15.2.0"

RPM_NAME = "ripgrep-bash-completion-15.2.0-1.3.noarch.rpm"
RPM_HASH = "494bba31aa568f4555d8de1f4825f6dd5da6993b3bd9d30679974f4640c28c770c8f5570eef161f8e2222cac717278d28d9162fb433c1a9c65b6b2e7de03ee78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ripgrep-bash-completion"

RDEPENDS:${PN} += "bash-completion \
ripgrep"

inherit rpm
