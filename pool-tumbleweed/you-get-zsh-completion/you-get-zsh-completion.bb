SUMMARY = "Zsh Completion for you-get"
DESCRIPTION = "ZSH command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1743"

RPM_NAME = "you-get-zsh-completion-0.4.1743-3.1.noarch.rpm"
RPM_HASH = "26fddee99a399c0cacfd469dbe615e78a80cdb79f777f321246e49d9bcbfe812d843f86cb402157d5529308a646ee13d15662708b9bf973180411f1a93bf2dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
