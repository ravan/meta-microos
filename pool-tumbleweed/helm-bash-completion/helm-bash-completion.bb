SUMMARY = "Bash Completion for helm"
DESCRIPTION = "Bash command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "4.2.4"

RPM_NAME = "helm-bash-completion-4.2.4-3.1.noarch.rpm"
RPM_HASH = "10db8105ac69292b585ec91ef3c47812e688e08000d47cf0ca021a592aa68f89b17b60cbf02c3b687802942b78243908ca925b7d963b74f019e40785c3edc9b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
helm"

inherit rpm
