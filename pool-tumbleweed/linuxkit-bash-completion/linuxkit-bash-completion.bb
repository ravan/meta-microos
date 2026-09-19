SUMMARY = "Bash Completion for linuxkit"
DESCRIPTION = "Bash command line completion support for linuxkit."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "linuxkit-bash-completion-1.8.2-1.6.noarch.rpm"
RPM_HASH = "8e907322a393e55e8b4e16a7b2105ac59a2279175478fcf59ff7e4f90b36e65f2c242323b1569d59b6550fb461e654c3fd4488a76d45873962eb84507e9d7b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linuxkit-bash-completion"

RDEPENDS:${PN} += "bash-completion \
linuxkit"

inherit rpm
