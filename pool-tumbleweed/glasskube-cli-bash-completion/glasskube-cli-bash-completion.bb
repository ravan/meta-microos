SUMMARY = "Bash Completion for glasskube-cli"
DESCRIPTION = "Bash command line completion support for glasskube-cli."
LICENSE = "Apache-2.0"

PV = "0.26.1"

RPM_NAME = "glasskube-cli-bash-completion-0.26.1-1.10.noarch.rpm"
RPM_HASH = "1e6eafae8d64a018f4e6fb7a18e34e6561c9ebdc1e8d3f7a21a9fdce4215237577b988993918c9fa8ae3541caa796b30c9c7b9e82602f734a63776c1df974c0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glasskube-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
glasskube-cli"

inherit rpm
