SUMMARY = "Bash Completion for regclient"
DESCRIPTION = "Bash command line completion support for regclient."
LICENSE = "Apache-2.0"

PV = "0.11.5"

RPM_NAME = "regclient-bash-completion-0.11.5-1.4.noarch.rpm"
RPM_HASH = "6eefa0551ea86f07a0c01a7deb9afefbd6b53f6186ed068245e8d9bed60ba02565179c6db0e501cc6dbc1c0ceedd9cab4ec3bcd41061fbaf94921278909f0a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "regclient-bash-completion"

RDEPENDS:${PN} += "bash-completion \
regclient"

inherit rpm
