SUMMARY = "Bash completion for chezmoi"
DESCRIPTION = "Bash command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.72.1"

RPM_NAME = "chezmoi-bash-completion-2.72.1-1.1.noarch.rpm"
RPM_HASH = "910b4a9da9e7d9898458a6981fa57edb0ae962519a6ca8b2d7853b4450b4066e095b23a219165cbeed350c607bcf656938a19a283394c6c02dc5ccf4f7b235ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-bash-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
