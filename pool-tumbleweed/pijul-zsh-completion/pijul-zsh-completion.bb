SUMMARY = "Zsh Completion for pijul"
DESCRIPTION = "Zsh command-line completion support for pijul."
LICENSE = "GPL-2.0-only"

PV = "1.0.0~beta.9"

RPM_NAME = "pijul-zsh-completion-1.0.0~beta.9-1.12.noarch.rpm"
RPM_HASH = "2104d9026bb9a2f7b24e3ee15dc0f2a1163963536d163c1fb8a25dbaac064834ac1307bc6be5ebbe26edfcb16b47de1ed3ce5ece1be7676454f41efbf8f3e77d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pijul-zsh-completion"

RDEPENDS:${PN} += "pijul \
zsh"

inherit rpm
