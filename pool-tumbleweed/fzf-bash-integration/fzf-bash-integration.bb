SUMMARY = "Bash completion for fzf"
DESCRIPTION = "Bash shell completions for fzf"
LICENSE = "MIT"

PV = "0.74.3"

RPM_NAME = "fzf-bash-integration-0.74.3-1.1.noarch.rpm"
RPM_HASH = "2bbf76d4077a1633434be134fbb4a11bfedf6433ff6cf763895e988bea88a9eff2914c6859e7142e274b234c44f630419caa62ae78e32b05e7faab410e0d7dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fzf-bash-integration \
fzf-bash-completion \
fzf-bash-integration"

RDEPENDS:${PN} += "bash-completion \
fzf"

inherit rpm
