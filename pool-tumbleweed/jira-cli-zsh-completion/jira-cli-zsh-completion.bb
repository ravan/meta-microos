SUMMARY = "Zsh Completion for jira-cli"
DESCRIPTION = "Zsh command line completion support for jira-cli."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "jira-cli-zsh-completion-1.6.0-1.8.noarch.rpm"
RPM_HASH = "31d11cea40d5c40f2f810b0c48a2dc25263fc7473e66f49c1bd242fd0642206f22d62dcd768e1528fd3369cb50269c8910ae654e07f91a324a6c65f2b236817b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jira-cli-zsh-completion"

RDEPENDS:${PN} += "jira-cli \
zsh"

inherit rpm
