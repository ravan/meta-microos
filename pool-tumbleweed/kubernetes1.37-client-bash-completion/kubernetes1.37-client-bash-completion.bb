SUMMARY = "Bash Completion for kubernetes1.37-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.37-client"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-client-bash-completion-1.37.0-1.1.noarch.rpm"
RPM_HASH = "8d351f8494a626f9cf972b7b8930a6a38e08d65dde3dd1e983cb2ba20e800fc15c6624180df6d7a004124c698347caf9d4bfb4824e75ebf8839761baa50d5fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.37-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.37-client"

inherit rpm
