SUMMARY = "Bash completion for nix"
DESCRIPTION = "Bash command-line completion for the Nix package manager."
LICENSE = "LGPL-2.1-only"

PV = "2.35.2"

RPM_NAME = "nix-bash-completion-2.35.2-1.1.noarch.rpm"
RPM_HASH = "228aafc7fcefafbbf164f6994ed6e061150e865541c4390c3edc87afbc9d2bb7404baa93d43a6ee20f222d088ecb93aa548f4e91367084865c21101cbbab3cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nix-bash-completion"

RDEPENDS:${PN} += "bash-completion \
nix"

inherit rpm
