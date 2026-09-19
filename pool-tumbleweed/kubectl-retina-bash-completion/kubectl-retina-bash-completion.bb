SUMMARY = "Bash Completion for kubectl-retina"
DESCRIPTION = "Bash command line completion support for kubectl-retina."
LICENSE = "Apache-2.0"

PV = "0.0.16"

RPM_NAME = "kubectl-retina-bash-completion-0.0.16-1.13.noarch.rpm"
RPM_HASH = "f5937f924d21e398b38bf713358e3ba1fd5cb3051a94460d612e90f91aeb1ba7a01836887f763560d851c722a606e521024b41c721b05508b845e29af9bd3ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-retina-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubectl-retina"

inherit rpm
