SUMMARY = "Bash Completion for conftest"
DESCRIPTION = "Bash command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.69.0"

RPM_NAME = "conftest-bash-completion-0.69.0-1.1.noarch.rpm"
RPM_HASH = "4bfa9266822375d0e60a444bb033beec7a8fcf5ad641d2720632f66e76ec0f7f29323bceed6ae8196fad2f1474ffeb04b740ac82b086680ec0fcbc9eee5d99fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-bash-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
