SUMMARY = "ZSH Completion for vcsh"
DESCRIPTION = "zsh command line completion support for vcsh."
LICENSE = "GPL-2.0-only"

PV = "1.20151229"

RPM_NAME = "vcsh-zsh-completion-1.20151229-4.7.noarch.rpm"
RPM_HASH = "33f0b64c335f6cab59fc8c00cf87a2dfd750c23f8fe6e25a72f39e9ec19ca6751a47865a495d7057d4dce9acb8328938bd310b112e03440db6c3285875a7e135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-vcsh-zsh-completion \
vcsh-zsh-completion"

RDEPENDS:${PN} += "vcsh"

inherit rpm
