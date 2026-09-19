SUMMARY = "Fish Completion for kubeaudit"
DESCRIPTION = "Fish command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.2"

RPM_NAME = "kubeaudit-fish-completion-0.22.2-1.13.noarch.rpm"
RPM_HASH = "9eadaa52ec8c883751b1a60468badecfae5ea51a3b0e9015c4055c8de3303edf86f04baf11bd47b9ab83998987fcb83c573638b3dcf0729270ec8743e7410b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-fish-completion"

RDEPENDS:${PN} += "kubeaudit"

inherit rpm
