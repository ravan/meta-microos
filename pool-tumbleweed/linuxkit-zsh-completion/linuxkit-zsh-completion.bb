SUMMARY = "Zsh Completion for linuxkit"
DESCRIPTION = "zsh command line completion support for linuxkit."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "linuxkit-zsh-completion-1.8.2-1.6.noarch.rpm"
RPM_HASH = "6c5140d1cdc25ad35f6b477cfbad952c5e38a04ee5dd9384e918e9ca77ad251819fbf7f6928109dd46e989346bd53f7cf3db13e4de7b8fb37ca56f9d052a66f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linuxkit-zsh-completion"

RDEPENDS:${PN} += "linuxkit"

inherit rpm
