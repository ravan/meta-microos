SUMMARY = "Zsh Completion for talhelper"
DESCRIPTION = "zsh command line completion support for talhelper."
LICENSE = "BSD-3-Clause"

PV = "3.1.17"

RPM_NAME = "talhelper-zsh-completion-3.1.17-1.1.noarch.rpm"
RPM_HASH = "a7ea47a49072d36906cd692d6f7b72c7607b41a52e57bf43f265e7ab3880ea24ef9f368fcba7e2051cd0ac83ca07007e2977aa24efe0f8a94d2c39a0db95ad72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "talhelper-zsh-completion"

RDEPENDS:${PN} += "talhelper"

inherit rpm
