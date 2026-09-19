SUMMARY = "Bash Completion for forge"
DESCRIPTION = "Bash command line completion support for forge."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "forge-bash-completion-0.10.0-1.1.noarch.rpm"
RPM_HASH = "ee31cb3d6115348a21dfa0c49812874a902c0e905d43b76afa62353efae690f5d6957a80bb9ed0918d9a4fa3f37a4e77d976bcbee80078d7e73c8e959d7313ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forge-bash-completion"

RDEPENDS:${PN} += "bash-completion \
forge"

inherit rpm
