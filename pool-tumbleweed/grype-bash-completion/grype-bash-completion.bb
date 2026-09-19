SUMMARY = "Bash Completion for grype"
DESCRIPTION = "Bash command line completion support for grype."
LICENSE = "Apache-2.0"

PV = "0.118.0"

RPM_NAME = "grype-bash-completion-0.118.0-1.1.noarch.rpm"
RPM_HASH = "f7a094ff17ca9b326b69beed0a7a2ca8ade5ad979dbd89046460ec4eca31a106853e2f3a5f4b222c64617997106f10e1d75a0f34d40d4d07c21b76fad66a96e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grype-bash-completion"

RDEPENDS:${PN} += "bash-completion \
grype"

inherit rpm
