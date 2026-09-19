SUMMARY = "Bash Completion for neocmakelsp"
DESCRIPTION = "Bash command-line completion support for neocmakelsp."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "neocmakelsp-bash-completion-0.9.0-1.5.noarch.rpm"
RPM_HASH = "ef3559f468b6efee12e837a0ff59d88866f980ca4f921078f1a03cdd54cda05c4b7756d92826de8cf35a303eb35cd11e95cbbe55de87a8a3f29a711f77ce11e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neocmakelsp-bash-completion"

RDEPENDS:${PN} += "bash-completion \
neocmakelsp"

inherit rpm
