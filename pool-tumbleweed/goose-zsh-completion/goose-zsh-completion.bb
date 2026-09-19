SUMMARY = "Zsh completion for goose"
DESCRIPTION = "Zsh command line completion support for goose."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & CDLA-Permissive-2.0 & ISC & LGPL-3.0-or-later & MIT & MIT-0 & MPL-2.0 & Unicode-3.0 & Zlib & bzip2-1.0.6"

PV = "1.50.0"

RPM_NAME = "goose-zsh-completion-1.50.0-1.1.noarch.rpm"
RPM_HASH = "816115d6e03525869d2bd3323510adbeb109652559b204ace4add62c7b62d2616081274ffc5fadaccb4b2e2cd02ce40d15c234701ed4fff0881af62dd94b58e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goose-zsh-completion"

RDEPENDS:${PN} += "goose"

inherit rpm
