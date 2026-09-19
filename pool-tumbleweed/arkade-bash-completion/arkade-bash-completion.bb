SUMMARY = "Bash Completion for arkade"
DESCRIPTION = "Bash command line completion support for arkade."
LICENSE = "Apache-2.0"

PV = "0.11.125"

RPM_NAME = "arkade-bash-completion-0.11.125-1.1.noarch.rpm"
RPM_HASH = "c293e183d7000aa551dc60794158689be31d67cee0b2e886b4dd9dec939dd5b3de486b31ef87e984b2474da1d611c0515ad7c580f76159083e02c282744c4c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arkade-bash-completion"

RDEPENDS:${PN} += "arkade \
bash-completion"

inherit rpm
