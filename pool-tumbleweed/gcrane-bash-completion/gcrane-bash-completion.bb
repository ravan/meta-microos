SUMMARY = "Bash Completion for gcrane"
DESCRIPTION = "Bash command line completion support for gcrane."
LICENSE = "Apache-2.0"

PV = "0.22.1"

RPM_NAME = "gcrane-bash-completion-0.22.1-1.1.noarch.rpm"
RPM_HASH = "a3c8a9ed2f2049927b4f43c911326ba427d5f5dc6dc509bca4828d178d3213e05336c42f28f817fd1f50d9734972190eb8f85b50926b73ff45c006e62be98b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcrane-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gcrane"

inherit rpm
