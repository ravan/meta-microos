SUMMARY = "Bash Completion for docker"
DESCRIPTION = "Bash command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "29.7.2_ce"

RPM_NAME = "docker-bash-completion-29.7.2_ce-41.1.noarch.rpm"
RPM_HASH = "951dc9c66256cca605b7197d78a5aef7f19c2aefa7ce082049bbf7a0ee7edabd528b83e81e17815e28bafb14695b9ba9b22f9d3d1de9b15ae7a4444638a45b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-bash-completion"

RDEPENDS:${PN} += "bash-completion \
docker"

inherit rpm
