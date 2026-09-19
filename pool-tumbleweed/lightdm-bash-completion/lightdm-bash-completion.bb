SUMMARY = "Bash completion for lightdm"
DESCRIPTION = "bash command line completion support for lightdm."
LICENSE = "GPL-3.0-or-later"

PV = "1.32.0"

RPM_NAME = "lightdm-bash-completion-1.32.0-9.4.noarch.rpm"
RPM_HASH = "9278a75c2f6c25a246fe0165d7e8a0e1fb72b264c1d6e487348544bc84d994bc9148902f9f2fb677d9bce1cfa557ff33dc400ee416feff2605df3f7edf6544f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
lightdm"

inherit rpm
