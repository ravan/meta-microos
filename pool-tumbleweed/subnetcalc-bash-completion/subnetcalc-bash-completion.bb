SUMMARY = "Bash Completion for subnetcalc"
DESCRIPTION = "The bash completion script for subnetcalc, generated during the build."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.6"

RPM_NAME = "subnetcalc-bash-completion-2.6.6-1.3.noarch.rpm"
RPM_HASH = "898c4a6e2a16154d227b6a4b7bc3d888a3b84934a497342eacf9ed7836ac89f693079e21d39a335f485a1bb0ab2f0a738fed3c89f7212926890618b5aebbcdcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subnetcalc-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
