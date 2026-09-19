SUMMARY = "Bash Completion for incus-cli"
DESCRIPTION = "Bash command line completion support for incus."
LICENSE = "Apache-2.0"

PV = "7.4"

RPM_NAME = "incus-cli-bash-completion-7.4-1.1.noarch.rpm"
RPM_HASH = "2b85a81ddf3780664873ef0fdeb322455e4c27cef9c8a2950f729c3c3e816f8862ef3ed613e302f7dac9fc9178d218fa1747d1ee2eaafdcf65cb5ca05aa436a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "incus-bash-completion \
incus-cli-bash-completion"

RDEPENDS:${PN} += "incus-cli"

inherit rpm
