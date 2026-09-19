SUMMARY = "Minikube fish completion"
DESCRIPTION = "Optional fish completion for minikube."
LICENSE = "Apache-2.0"

PV = "1.38.1"

RPM_NAME = "minikube-fish-completion-1.38.1-1.3.noarch.rpm"
RPM_HASH = "56b54dd29f37c811a015bb114529ad1ba6dc9bd668a603e96b5e7299d7754ad982ea148efd585b4c22ae98e52e88a2cdf5290552fb9eb03787e3e73b0ea7109a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minikube-fish-completion"

RDEPENDS:${PN} += "fish \
minikube"

inherit rpm
