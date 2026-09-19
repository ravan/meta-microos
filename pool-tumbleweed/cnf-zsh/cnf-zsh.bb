SUMMARY = "Integration of cnf with zsh"
DESCRIPTION = "Zsh setup code for command-not-found handler cnf."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "cnf-zsh-0.9.1-1.1.noarch.rpm"
RPM_HASH = "3e32da202244a7122b79b30aae42bb8438ce0776a2881da0cb74e7b5a44f7ad38cbf05d0c93890a39dcdad59003de85e112c78968e998010a6ec312842aa4fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cnf-rs-zsh \
cnf-zsh \
config-cnf-zsh"

RDEPENDS:${PN} += ""

inherit rpm
