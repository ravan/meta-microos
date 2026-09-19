SUMMARY = "Minikube bash completion"
DESCRIPTION = "Optional bash completion for minikube."
LICENSE = "Apache-2.0"

PV = "1.38.1"

RPM_NAME = "minikube-bash-completion-1.38.1-1.3.noarch.rpm"
RPM_HASH = "937940c9b1e5a40aa79e865112384e050b4e8395c3f0c11a526fee06a14b3d8705d90cc421f8a87f223e917a9728d72ed8f2580272c85a62be684e30304cf75c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minikube-bash-completion"

RDEPENDS:${PN} += "bash \
bash-completion \
minikube"

inherit rpm
