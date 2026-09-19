SUMMARY = "Bash Completion for hyperfine"
DESCRIPTION = "The official bash completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.20.0"

RPM_NAME = "hyperfine-bash-completion-1.20.0-2.4.noarch.rpm"
RPM_HASH = "fd587c846ccfec88f5ac4e4cb38d2a4fcf2e593966afe78ef6224f1c3f246b3779be2a7c9b966ea55aceaf5eccc6eb5a70505bb4b4b5b52005c2971c22d8904c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-bash-completion"

RDEPENDS:${PN} += "bash-completion \
hyperfine"

inherit rpm
