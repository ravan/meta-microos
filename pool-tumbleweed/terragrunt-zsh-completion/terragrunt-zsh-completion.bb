SUMMARY = "Zsh Completion for terragrunt"
DESCRIPTION = "zsh command line completion support for terragrunt."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "terragrunt-zsh-completion-1.1.2-1.1.noarch.rpm"
RPM_HASH = "beffecb71c68f3bad6cc97269891859ea5ac73f64c5812b212514652e7e829776353c2134c12c7422305a429c409f2bce88a3d007adfea753eae9b6d22e81094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terragrunt-zsh-completion"

RDEPENDS:${PN} += "terragrunt \
zsh"

inherit rpm
