SUMMARY = "Bash Completion for werf"
DESCRIPTION = "Bash command line completion support for werf."
LICENSE = "Apache-2.0"

PV = "2.75.3"

RPM_NAME = "werf-bash-completion-2.75.3-1.1.noarch.rpm"
RPM_HASH = "738f6b9f4809ecce855b991286e96bd2be15eecfd44c26eb33818acc9b306af6a6e147c2f3070e45625cd272d7ef3582456184ebf7818e1ee4218d605567735a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "werf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
werf"

inherit rpm
