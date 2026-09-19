SUMMARY = "Bash Completion for jira-cli"
DESCRIPTION = "Bash command line completion support for jira-cli."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "jira-cli-bash-completion-1.6.0-1.8.noarch.rpm"
RPM_HASH = "1ec8e1c2ad07f3e3609fe315586456610eaaa2f6b3fd41450c3e5f518531cc775b5f1542215684b6dbdba44848125e4687e09f8723e301564facf7b06555e514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jira-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
jira-cli"

inherit rpm
