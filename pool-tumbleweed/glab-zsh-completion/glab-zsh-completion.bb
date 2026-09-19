SUMMARY = "Zsh completion for glab"
DESCRIPTION = "Zsh command line completion support for glab."
LICENSE = "MIT"

PV = "1.115.0"

RPM_NAME = "glab-zsh-completion-1.115.0-1.1.noarch.rpm"
RPM_HASH = "00c084935949672ac8bb9216db460b8c798ba735b9cd36a9f21835f9252d81edd316f93b65725db527100344a290cdb490127e6f9ddd83bebd12151b7af0398d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-zsh-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
