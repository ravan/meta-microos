SUMMARY = "Bash completions for nnn"
DESCRIPTION = "The official bash completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "5.2"

RPM_NAME = "nnn-bash-completion-5.2-1.3.noarch.rpm"
RPM_HASH = "75141497c1f0d5be5cbe75bff3d24f9250b6eb7c7d7f593523419a5362a74bb5906273242fd9d7c81fd2bca514998f45093b83cab475e8662f0bfd42b7ee0f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
