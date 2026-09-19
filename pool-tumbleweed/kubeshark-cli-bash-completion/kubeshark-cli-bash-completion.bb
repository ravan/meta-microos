SUMMARY = "Bash Completion for kubeshark-cli"
DESCRIPTION = "Bash command line completion support for kubeshark-cli."
LICENSE = "Apache-2.0"

PV = "53.4.0"

RPM_NAME = "kubeshark-cli-bash-completion-53.4.0-1.1.noarch.rpm"
RPM_HASH = "cabfa300c7d88c3016ed95070c1f935556425182e57dc6bb565d77ae4b76539e50ed24dec7cda3c77aaab688baf4ed6f816c2c9dd0391b5a52fe67e0f78a6726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeshark-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubeshark-cli"

inherit rpm
