SUMMARY = "Bash Completion for kubeaudit"
DESCRIPTION = "Bash command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.2"

RPM_NAME = "kubeaudit-bash-completion-0.22.2-1.13.noarch.rpm"
RPM_HASH = "0a501ccebc09778dec91193a207c2af710bcec77dc20748e9145345c8ff56bc7f03d21462712052c0c2cff25a8109d8f5649093f3903e13883cc966374ff33d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubeaudit"

inherit rpm
