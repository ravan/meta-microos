SUMMARY = "Bash Completion for kubectl-gather"
DESCRIPTION = "Bash command line completion support for kubectl-gather."
LICENSE = "Apache-2.0"

PV = "0.14.0"

RPM_NAME = "kubectl-gather-bash-completion-0.14.0-1.1.noarch.rpm"
RPM_HASH = "78f4dbbf824f296bc45e87f62cf13946d339d7c4b7fff0e50f6e13e554da972910c73245c8a72a2eead62916a668f0cd2416dec54b318305f250027b1fcdedfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-gather-bash-completion"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-completion \
kubectl-gather"

inherit rpm
