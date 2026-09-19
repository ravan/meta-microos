SUMMARY = "Bash Completion for falcoctl"
DESCRIPTION = "Bash command line completion support for falcoctl."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "falcoctl-bash-completion-0.13.0-1.4.noarch.rpm"
RPM_HASH = "9a5031a993c8808dc2fa3c2f8498e7ddb6cdbd559ca13471f6f501da29c09087896050b2508ba219eb643e3cdda9238fb63d4b128d897915d5146bb397597bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "falcoctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
falcoctl"

inherit rpm
