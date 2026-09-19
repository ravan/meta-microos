SUMMARY = "Bash Completion for xca"
DESCRIPTION = "Bash completion script for xca."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "xca-bash-completion-2.9.0-4.1.noarch.rpm"
RPM_HASH = "2aa72755fc8617cc706c7bf59ce65e59f9175908b5f6d12b6cd25ddd4e0c960baa9124c5814950b56367029585182e5deb64517f6029036104bc100ce91a33e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xca-bash-completion"

RDEPENDS:${PN} += "bash-completion \
xca"

inherit rpm
