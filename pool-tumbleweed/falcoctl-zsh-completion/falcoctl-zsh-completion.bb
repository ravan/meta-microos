SUMMARY = "Zsh Completion for falcoctl"
DESCRIPTION = "zsh command line completion support for falcoctl."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "falcoctl-zsh-completion-0.13.0-1.4.noarch.rpm"
RPM_HASH = "251af61cf8be40790625b8a3071905fa2cb6c6803921d5beccfb70e5d288f5631ee1d508b683d973fce3d255d673ffd14027d3a101b64fe971c7f3cd463e5642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "falcoctl-zsh-completion"

RDEPENDS:${PN} += "falcoctl"

inherit rpm
