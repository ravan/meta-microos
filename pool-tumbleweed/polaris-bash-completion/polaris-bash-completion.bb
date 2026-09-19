SUMMARY = "Bash Completion for polaris"
DESCRIPTION = "Bash command line completion support for polaris."
LICENSE = "Apache-2.0"

PV = "10.2.2"

RPM_NAME = "polaris-bash-completion-10.2.2-1.1.noarch.rpm"
RPM_HASH = "ffb8c3d123a03147bf0651ecd1123c727d65fe8ab23ebef15fc30424f719b13438df399bb8a4dab36bdb11754eea46b6c196e268ef882cb2af152371c849adb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "polaris-bash-completion"

RDEPENDS:${PN} += "bash-completion \
polaris"

inherit rpm
