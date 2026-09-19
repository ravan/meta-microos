SUMMARY = "Bash Completion for marvin"
DESCRIPTION = "Bash command line completion support for marvin."
LICENSE = "Apache-2.0"

PV = "0.2.13"

RPM_NAME = "marvin-bash-completion-0.2.13-1.1.noarch.rpm"
RPM_HASH = "05b9c17f9dd673a19ea457702904950dec5fe7a3c5dadddedc9863db64ed171c64a7479c0792f163d4b2bb0e79cdce91a4242313d13af793fd171e5a0d39992d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marvin-bash-completion"

RDEPENDS:${PN} += "bash-completion \
marvin"

inherit rpm
