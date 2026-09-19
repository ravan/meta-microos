SUMMARY = "Bash Completion for kubefirst"
DESCRIPTION = "Bash command line completion support for kubefirst."
LICENSE = "MIT"

PV = "2.10.5"

RPM_NAME = "kubefirst-bash-completion-2.10.5-1.7.noarch.rpm"
RPM_HASH = "2bbd9433afd9d874206d54f5f4a71783933d9dd783704658bdd38cb2c27d59ce746f059530867621b76a7a727b3e3c158b008b8a80ea70ff2d97e82dfd3e5635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubefirst-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubefirst"

inherit rpm
