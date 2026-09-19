SUMMARY = "Bash Completion for kubectx"
DESCRIPTION = "Bash command line completion support for kubectx."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "kubectx-bash-completion-0.11.0-1.5.noarch.rpm"
RPM_HASH = "312b1144d03bfaa4f80d68f75f2119b69e3f7cba613848bcae5483b0fdc5a4842d7387dd965f94dae71bb00457c579d9eae7ad3eb7543c5165eaa745c844dd43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectx-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubectx"

inherit rpm
