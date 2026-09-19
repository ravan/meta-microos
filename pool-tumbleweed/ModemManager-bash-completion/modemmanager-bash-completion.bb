SUMMARY = "Bash completion for mmcli"
DESCRIPTION = "This package contain the bash completion command for nmcli tools."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.24.2"

RPM_NAME = "ModemManager-bash-completion-1.24.2-1.6.noarch.rpm"
RPM_HASH = "1066865e5382ac9f577dceb158608e323c1ea32483e47f74572f83b41b00c2d8c4b659bdf60e55b11b5c095802e3e8f027a83d285cbc72d8559e4b2a0c261868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ModemManager-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
