SUMMARY = "Zsh Completion for nova"
DESCRIPTION = "zsh command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "nova-zsh-completion-3.12.0-1.4.noarch.rpm"
RPM_HASH = "fb5eb20747954c7a154aedf64e1aed1222ff23243b6616418e6a2a22c2e0ba83722c86c226323c70aa852cdb3c8a3a77ac58c414b1975dc3aca1edf0854aad0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-zsh-completion"

RDEPENDS:${PN} += "nova"

inherit rpm
