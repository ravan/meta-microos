SUMMARY = "NVM Express user space tools bash completion"
DESCRIPTION = "Optional dependency offering bash completion for NVM Express user space tools"
LICENSE = "GPL-2.0-only"

PV = "3.0+6.g1ac60ca4b"

RPM_NAME = "nvme-cli-bash-completion-3.0+6.g1ac60ca4b-1.1.noarch.rpm"
RPM_HASH = "984824a3519d47ae3a8463991d379760b5536490f446be232e3a99c295d905627f0a12c994e1d01e1640fdd84fd7d62265b2d4f5a6de12669f20619840a308f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-bash-completion"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-completion \
nvme-cli"

inherit rpm
