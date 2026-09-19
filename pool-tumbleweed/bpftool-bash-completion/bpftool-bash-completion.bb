SUMMARY = "Bash completion for bpftool"
DESCRIPTION = "bash command line completion support for bpftool."
LICENSE = "GPL-2.0-only"

PV = "7.7.0"

RPM_NAME = "bpftool-bash-completion-7.7.0-2.1.noarch.rpm"
RPM_HASH = "97c7653b5fda55f875537901e33d4db6e5c15fdbeafb48c190a45ad9e94f32f3194e02acaf2acf96b7eb6731da07abaa817921ae57433c0268dd576e3b8e914e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bpftool-bash-completion"

RDEPENDS:${PN} += "bash-completion \
bpftool"

inherit rpm
