SUMMARY = "Zsh Completion for fastfetch"
DESCRIPTION = "Zsh command-line completion support for fastfetch."
LICENSE = "MIT"

PV = "2.68.1"

RPM_NAME = "fastfetch-zsh-completion-2.68.1-1.1.noarch.rpm"
RPM_HASH = "a5520cb380ad90e88911638f96dca6094e0b90b9eaf767f10ae58144195a9544056b17b738232a857f75aa72158c077399b50248c6d3a5507365c87d01965ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fastfetch-zsh-completion"

RDEPENDS:${PN} += "fastfetch \
zsh"

inherit rpm
