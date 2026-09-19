SUMMARY = "Bash Completion for flashrom"
DESCRIPTION = "Bash command-line completion support for flashrom."
LICENSE = "GPL-2.0-only"

PV = "1.8.0+git0.90b6b437"

RPM_NAME = "flashrom-bash-completion-1.8.0+git0.90b6b437-1.1.noarch.rpm"
RPM_HASH = "da061485d9499029f2bcb11e34b1a61301357cad767e586b67382d92669d9a472f8968842b58c637f2c79e0647f527f771c1f9bbbc6089c86def8722e3a38c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flashrom-bash-completion"

RDEPENDS:${PN} += "bash-completion \
flashrom"

inherit rpm
