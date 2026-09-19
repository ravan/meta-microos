SUMMARY = "Bash Completion for git-town"
DESCRIPTION = "Bash command line completion support for git-town."
LICENSE = "MIT"

PV = "24.0.0"

RPM_NAME = "git-town-bash-completion-24.0.0-1.2.noarch.rpm"
RPM_HASH = "ac8cece9eaa0c707dc17f1d14ab23e2277af9d18fbb17056a1e210143ed75c9fcba3231684ac7ea753e50e69617e2b615ecc424e5ebd9fa0a0b87f954abe5c7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-town-bash-completion"

RDEPENDS:${PN} += "bash-completion \
git-town"

inherit rpm
