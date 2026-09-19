SUMMARY = "Zsh Completion for typst"
DESCRIPTION = "Zsh command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "typst-zsh-completion-0.15.1-1.1.noarch.rpm"
RPM_HASH = "2102a047187afd76bbe98f886c8875ac189ac3b5051a3bc6d01ca5ac4027821bcc40947f99a83870aa0208554e2002b621f3535ac8578f0f6140de796c11f72a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-zsh-completion"

RDEPENDS:${PN} += "typst"

inherit rpm
