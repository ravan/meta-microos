SUMMARY = "Bash Completion for tekton-cli"
DESCRIPTION = "Bash command line completion support for tekton-cli."
LICENSE = "Apache-2.0"

PV = "0.46.0"

RPM_NAME = "tekton-cli-bash-completion-0.46.0-1.1.noarch.rpm"
RPM_HASH = "f3ad1851aa68ae52e32d9d803f0321397bf272d5690bfca7d93a25ae6656c5d0143506c6039b722e305508609f7852cd5679dab6ddf2057003d571847d82acea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tekton-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tekton-cli"

inherit rpm
