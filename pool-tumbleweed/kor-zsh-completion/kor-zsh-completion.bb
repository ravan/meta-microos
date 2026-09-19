SUMMARY = "Zsh Completion for kor"
DESCRIPTION = "zsh command line completion support for kor."
LICENSE = "MIT"

PV = "0.6.8"

RPM_NAME = "kor-zsh-completion-0.6.8-1.4.noarch.rpm"
RPM_HASH = "b86ffe93ea5aeacab22ab32363f06767689a204ba97c77ef6a733d105de9c1103a9fa471c016acf8b34e4e6a436557fd98ae6029c5c43095ae7745fe29573c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kor-zsh-completion"

RDEPENDS:${PN} += "kor"

inherit rpm
