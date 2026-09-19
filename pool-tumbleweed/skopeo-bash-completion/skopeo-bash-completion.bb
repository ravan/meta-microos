SUMMARY = "Bash completion for skopeo"
DESCRIPTION = "This package contains the bash completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.24.0"

RPM_NAME = "skopeo-bash-completion-1.24.0-1.1.noarch.rpm"
RPM_HASH = "d6ac306485bf05fc1d79a76dcdf05a486202f15a20c9a80a8d27113b0b08b12da604469fec9fcafe8596fe2de35689902c98cb016d420e7d6058950d0839fea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-bash-completion"

RDEPENDS:${PN} += "bash-completion \
skopeo"

inherit rpm
