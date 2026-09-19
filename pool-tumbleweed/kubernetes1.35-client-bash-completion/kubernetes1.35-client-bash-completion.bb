SUMMARY = "Bash Completion for kubernetes1.35-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.35-client"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-client-bash-completion-1.35.8-2.1.noarch.rpm"
RPM_HASH = "6f5b11ec0afc6a2ba14751cd2928aca39aa8ddf3477174d14e5f05c69bb7b2653cc5106b9d173fa8c72f2732f475b26c9593ca2844dee4eff553846e2340ac32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.35-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.35-client"

inherit rpm
