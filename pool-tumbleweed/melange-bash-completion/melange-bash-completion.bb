SUMMARY = "Bash Completion for melange"
DESCRIPTION = "Bash command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "melange-bash-completion-0.59.2-1.1.noarch.rpm"
RPM_HASH = "1c88a1d9038dd0d870163b922381279e79dd3097b214d6e961add45468bed719a1f2ca835022802c2c0159cb83d22b7ae95b608b9d171a6d46db48db33733e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-bash-completion"

RDEPENDS:${PN} += "melange"

inherit rpm
