SUMMARY = "ZSH completion for jo"
DESCRIPTION = "zsh shell completions for jo."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.9"

RPM_NAME = "jo-zsh-completion-1.9-1.12.noarch.rpm"
RPM_HASH = "095b3900b5188ce814fc8e380529bfa0083b43b5272720e804f604bcbfb59de065e28650c06a207eceb58ded54ba7c6c878fd2327474b19198b2e9cb941965e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-jo-zsh-completion \
jo-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
