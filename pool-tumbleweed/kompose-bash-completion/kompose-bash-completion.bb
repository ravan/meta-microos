SUMMARY = "Bash Completion for kompose"
DESCRIPTION = "Bash command line completion support for kompose."
LICENSE = "Apache-2.0"

PV = "1.38.0"

RPM_NAME = "kompose-bash-completion-1.38.0-1.7.noarch.rpm"
RPM_HASH = "d14f6cac20bd6fc7c7db01fef8e5efeb870285e70c7c64c77b4ddafb1fe6ddce60c645f21a2018569fdfa65181f105f6256b973335f11ec264c253fb09d9e95e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kompose-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kompose"

inherit rpm
