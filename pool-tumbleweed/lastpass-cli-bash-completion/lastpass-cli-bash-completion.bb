SUMMARY = "Bash completion for lastpass-cli"
DESCRIPTION = "The bash completion script for the lpass command."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "lastpass-cli-bash-completion-1.6.1-1.1.noarch.rpm"
RPM_HASH = "04eb5fde8d8a63ec32c3a5251249a9526c56bf1a8aa18021f50d5e01c3f5434f36e9ac130ff22f95c39011255b04106a7523ca19e2d65cd1f9f22704dfce6fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lastpass-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
lastpass-cli"

inherit rpm
