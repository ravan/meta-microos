SUMMARY = "Bash Completion for fclones"
DESCRIPTION = "The official bash completion script for fclones, generated during the build."
LICENSE = "MIT"

PV = "0.35.0"

RPM_NAME = "fclones-bash-completion-0.35.0-2.5.noarch.rpm"
RPM_HASH = "d9adf7335ea5b07a1f8c9553fd3038833086d0a14a3ea1dd769fe21336bad44e52c9b6d991f288807b4d34223d260f5b6827dd035c8c4d6fda219f5920d827c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fclones-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
