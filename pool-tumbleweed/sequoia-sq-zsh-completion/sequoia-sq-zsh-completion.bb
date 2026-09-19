SUMMARY = "Zsh Completion for sequoia-sq"
DESCRIPTION = "Zsh command-line completion support for sequoia-sq."
LICENSE = "LGPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "sequoia-sq-zsh-completion-1.4.0-4.1.noarch.rpm"
RPM_HASH = "97262b39c1cf8c0a2e6d0e4b482cca2b3f940c94e4f0fbceb68a9050bc855057c2e5a09a164135cbb6522504a3a0b763ebca2448025f76ed56fbf346d09bb68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sequoia-sq-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
