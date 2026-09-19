SUMMARY = "Bash Completion for autorandr"
DESCRIPTION = "Bash command-line completion support for autorandr."
LICENSE = "GPL-3.0-or-later"

PV = "1.15.0.1709469470"

RPM_NAME = "autorandr-bash-completion-1.15.0.1709469470-2.4.noarch.rpm"
RPM_HASH = "028741d179f4ffdb7237980b3b72968a741a12f8a65c375c2f964b944b122109d924f84c94b9cf44e20e64938c10486c91e11450d4916716b47d5f82cebfd9a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autorandr-bash-completion"

RDEPENDS:${PN} += "autorandr \
bash-completion"

inherit rpm
