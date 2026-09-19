SUMMARY = "Zsh Completion for nono-cli"
DESCRIPTION = "Zsh command line completion support for nono-cli."
LICENSE = "Apache-2.0"

PV = "0.77.0"

RPM_NAME = "nono-cli-zsh-completion-0.77.0-1.1.noarch.rpm"
RPM_HASH = "0f418002d8dce49d4eba97ae6c4986a46310483061149de5092beae0ca4c0576dbf6793e6b7deddc4fd4d7093c70e2c6444579c21596be8c9f52f6fffc7a6288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nono-cli-zsh-completion"

RDEPENDS:${PN} += "nono-cli"

inherit rpm
