SUMMARY = "Bash Completion for magic-wormhole.rs"
DESCRIPTION = "Bash command-line completion support for magic-wormhole.rs."
LICENSE = "EUPL-1.2"

PV = "0.8.1"

RPM_NAME = "magic-wormhole.rs-bash-completion-0.8.1-1.3.noarch.rpm"
RPM_HASH = "07d8d324ffb3ff330bae3518c406283cfa967179005f360644efd23447f1d4a0f159699ae41a49969939ef206713e84688639f027f2888ccac3624f5e239efd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "magic-wormhole.rs-bash-completion"

RDEPENDS:${PN} += "bash-completion \
magic-wormhole.rs"

inherit rpm
