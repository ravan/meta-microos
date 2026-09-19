SUMMARY = "Bash Completion for step-cli"
DESCRIPTION = "Bash completion script for step-cli."
LICENSE = "Apache-2.0"

PV = "0.30.6"

RPM_NAME = "step-cli-bash-completion-0.30.6-1.3.noarch.rpm"
RPM_HASH = "853c503512395b78235239d9855cc4e17b91a5404888bb6e5c5613054e9d1b6f6dae062272b8347b24012baeb71e95a0f02b2546e62047939ebfb2355fd54985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "step-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
step-cli"

inherit rpm
