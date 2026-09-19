SUMMARY = "Bash Completion for updatecli"
DESCRIPTION = "Bash command line completion support for updatecli."
LICENSE = "Apache-2.0"

PV = "0.120.1"

RPM_NAME = "updatecli-bash-completion-0.120.1-1.1.noarch.rpm"
RPM_HASH = "6b8622506a17d08e1dc3205eb3240f29c8bd97dd762d4870b0e224889fadd777a78703e5da7526de6faca207d33f63ab021bc698d57c3d420e85c52f228ca833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "updatecli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
updatecli"

inherit rpm
