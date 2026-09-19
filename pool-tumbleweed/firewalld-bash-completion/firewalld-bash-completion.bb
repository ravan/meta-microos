SUMMARY = "Bash Completion for firewalld"
DESCRIPTION = "Bash command line completion support for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "firewalld-bash-completion-2.3.2-2.1.noarch.rpm"
RPM_HASH = "3b99af23ef528fb7864ed78b3013cbd3d3f9b9684d72c7e592e99a876c42441d9af736673fa8a28fcfd4da608f9fece64b616a75145486bd76574e2da3d17994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-bash-completion"

RDEPENDS:${PN} += "bash-completion \
firewalld"

inherit rpm
