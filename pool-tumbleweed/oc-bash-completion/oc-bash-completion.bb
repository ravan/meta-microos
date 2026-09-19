SUMMARY = "Bash Completion for oc"
DESCRIPTION = "Bash command line completion support for oc."
LICENSE = "Apache-2.0"

PV = "4.22.0"

RPM_NAME = "oc-bash-completion-4.22.0-1.3.noarch.rpm"
RPM_HASH = "922cd762772098bbd1eea8afd73a34e979d11238fd7e6ba3a0458117e23a8880a36123c9e45dc3bdee86bc0938e311109be0fcc1c2bcfa340e69ea7612952610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oc-bash-completion"

RDEPENDS:${PN} += "bash-completion \
oc"

inherit rpm
