SUMMARY = "Fish Completion for jira-cli"
DESCRIPTION = "Fish command line completion support for jira-cli."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "jira-cli-fish-completion-1.6.0-1.8.noarch.rpm"
RPM_HASH = "2fa11fece5f8ca39be36efcf8ccdc4a3b8e84ea1c111b9f4b524220665a72c3eb6049f22f154bc77d168f3ac2a0ca7d74558b0fdc317821f18675cc296396b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jira-cli-fish-completion"

RDEPENDS:${PN} += "fish \
jira-cli"

inherit rpm
