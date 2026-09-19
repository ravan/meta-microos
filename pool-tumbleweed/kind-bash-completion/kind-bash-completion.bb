SUMMARY = "Bash Completion for kind"
DESCRIPTION = "Bash command line completion support for kind."
LICENSE = "Apache-2.0"

PV = "0.33.0"

RPM_NAME = "kind-bash-completion-0.33.0-1.1.noarch.rpm"
RPM_HASH = "a133dbccf003a52544ee65217c64fe277514b0255868179bfba2bdae43f05dc2b88d2dc5368eb9b8fa81c26145ba0ecdae4629cdc480b0926d9ae185e6a9d33a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kind-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kind"

inherit rpm
