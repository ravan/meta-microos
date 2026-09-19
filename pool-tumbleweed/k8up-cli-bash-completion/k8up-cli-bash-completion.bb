SUMMARY = "Bash Completion for k8up-cli"
DESCRIPTION = "Bash command line completion support for k8up-cli."
LICENSE = "Apache-2.0"

PV = "2.16.0"

RPM_NAME = "k8up-cli-bash-completion-2.16.0-1.2.noarch.rpm"
RPM_HASH = "96963b0e31d5a82ad77c5d1fd74414f7d37c17d8b108dfda270db32e0e18382e206ffe63de98d0c341055f3dcc97db495b958f18f423c6df2e9741a6316cf675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k8up-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
k8up-cli"

inherit rpm
