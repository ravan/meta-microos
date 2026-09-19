SUMMARY = "Bash Completion for crane"
DESCRIPTION = "Bash command line completion support for crane."
LICENSE = "Apache-2.0"

PV = "0.22.1"

RPM_NAME = "crane-bash-completion-0.22.1-1.1.noarch.rpm"
RPM_HASH = "bd46137b53a715f59d972feb5e0464dd968abc507ef6ceb8da6d49eadc8b4b749b6939d3dc2053b8a56544e9d6ef816fccb8660382a19fdbc5c57a52fd39a133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crane-bash-completion"

RDEPENDS:${PN} += "bash-completion \
crane"

inherit rpm
