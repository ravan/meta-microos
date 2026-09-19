SUMMARY = "Bash Completion for terragrunt"
DESCRIPTION = "Bash command line completion support for terragrunt."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "terragrunt-bash-completion-1.1.2-1.1.noarch.rpm"
RPM_HASH = "fc967ea2130418456ecaa7d4059d5274d1efdd93cac71b0e93911b231536fbc91327bf73b9fc46195f7cc285dc830e1976bd2d84cddeff458b1c91d521894abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terragrunt-bash-completion"

RDEPENDS:${PN} += "bash-completion \
terragrunt"

inherit rpm
