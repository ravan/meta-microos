SUMMARY = "Bash Completion for netfetch"
DESCRIPTION = "Bash command line completion support for netfetch."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "netfetch-bash-completion-0.5.4-1.10.noarch.rpm"
RPM_HASH = "71b53c80583186935409375cd6613ca564d267ea6eddaa73e70883b8a3ee84cb8d0192f5e537426f59bf9e079790fa8bbc8b1065a627c01276c5efff8f354ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netfetch-bash-completion"

RDEPENDS:${PN} += "bash-completion \
netfetch"

inherit rpm
