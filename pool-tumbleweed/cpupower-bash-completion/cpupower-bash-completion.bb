SUMMARY = "Bash completion for cpupower"
DESCRIPTION = "bash command line completion support for cpupower."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "cpupower-bash-completion-7.2.5-14.14.noarch.rpm"
RPM_HASH = "54785af48aeff54324f04aebbcc4223e580954e5ad400a8efe4a5f7563e9bc6fa5d49fbaed28ae4f350efb6afe35b82e2f0868111ea02f2aa15471fec69cc67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cpupower"

inherit rpm
