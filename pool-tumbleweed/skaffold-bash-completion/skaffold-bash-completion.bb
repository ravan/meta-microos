SUMMARY = "Bash Completion for skaffold"
DESCRIPTION = "Bash command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.24.0"

RPM_NAME = "skaffold-bash-completion-2.24.0-1.2.noarch.rpm"
RPM_HASH = "2afca01b030bbc7bd76fd2b026b56da5564fde1a68e76500da0ee739df5e69e6e52f05d8e5a0e3312a24588c7772004d7e53e387f1dbb31bd8dcc2441e516b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-bash-completion"

RDEPENDS:${PN} += "bash-completion \
skaffold"

inherit rpm
