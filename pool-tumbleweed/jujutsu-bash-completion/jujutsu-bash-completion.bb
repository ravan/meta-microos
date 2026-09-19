SUMMARY = "Bash Completion for jujutsu"
DESCRIPTION = "Bash command line completion support for jujutsu."
LICENSE = "MIT"

PV = "0.44.0"

RPM_NAME = "jujutsu-bash-completion-0.44.0-1.2.noarch.rpm"
RPM_HASH = "146227d59129738ac0aa549db9b270e8504e770b660edc6b6dd1aa7ee51c29b8f5135c0e7672458662f7770608126806dc69e2d5375f5ad4859fb826afa9a0a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jujutsu-bash-completion"

RDEPENDS:${PN} += "bash-completion \
jujutsu"

inherit rpm
