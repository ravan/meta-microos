SUMMARY = "Bash Completion for wolfictl"
DESCRIPTION = "Bash command line completion support for wolfictl."
LICENSE = "Apache-2.0"

PV = "0.39.25"

RPM_NAME = "wolfictl-bash-completion-0.39.25-1.1.noarch.rpm"
RPM_HASH = "992723f0dbc8cd98d88a9fb8d0bbcc02adbd0abc1a36a2d765bb1ee9b60d0fed4b33957b84562ac21aae5663a7dd3b54bfe2750b41a74ac74ac66a3c8b52e956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wolfictl-bash-completion"

RDEPENDS:${PN} += "wolfictl"

inherit rpm
