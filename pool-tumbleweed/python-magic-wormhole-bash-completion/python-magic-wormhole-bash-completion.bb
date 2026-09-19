SUMMARY = "Bash Completion for python-magic-wormhole"
DESCRIPTION = "Bash command-line completion support for python-magic-wormhole."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "python-magic-wormhole-bash-completion-0.24.0-2.1.noarch.rpm"
RPM_HASH = "f281601a7c44c4cc3f5793683281c67396f2bb32b94b34d8794459f8be7a4199d4fa0da17c766bd66d144a5c4a917d2ffe52e0cf915d90766480901ecbfa2847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-magic-wormhole-bash-completion"

RDEPENDS:${PN} += "bash-completion \
python3dist-magic-wormhole"

inherit rpm
