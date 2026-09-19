SUMMARY = "Bash Completion for kubearmor-client"
DESCRIPTION = "Bash command line completion support for kubearmor-client."
LICENSE = "Apache-2.0"

PV = "1.4.9"

RPM_NAME = "kubearmor-client-bash-completion-1.4.9-1.2.noarch.rpm"
RPM_HASH = "fc8a898e8dcb37b3f05f63186bcc87badcbf3fb8a0c20a252c99e1e9258bf9a050d36adc6a2cf3e6cf2929036f4573723275377a5d6317a677f60c30414be13d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubearmor-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubearmor-client"

inherit rpm
