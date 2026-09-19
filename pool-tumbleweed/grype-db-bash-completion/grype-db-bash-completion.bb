SUMMARY = "Bash Completion for grype-db"
DESCRIPTION = "Bash command line completion support for grype-db."
LICENSE = "Apache-2.0"

PV = "0.54.3"

RPM_NAME = "grype-db-bash-completion-0.54.3-1.1.noarch.rpm"
RPM_HASH = "aab162eb7d1cf2a49a39281d9064c4080e39a9b6c02ce15c7e2421e1dba0f747005f65f97ec1127be353124979e9953d818ed0df088aaa41c4018efa42e3442b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grype-db-bash-completion"

RDEPENDS:${PN} += "bash-completion \
grype-db"

inherit rpm
