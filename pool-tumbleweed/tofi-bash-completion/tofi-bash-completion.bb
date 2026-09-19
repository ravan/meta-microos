SUMMARY = "Bash Completion for tofi"
DESCRIPTION = "Bash command-line completion support for tofi."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "tofi-bash-completion-0.9.1-2.11.noarch.rpm"
RPM_HASH = "4723952e78681996f29fcb53ccd66ce37456a2e7a6aca6e1ef46bb4f01831fa04aa810a736ae88e1439bf6fbfbafb13ef818542c29d3923ab2f9f4f889f8488c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tofi-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
