SUMMARY = "Bash Completion for openQA"
DESCRIPTION = "The official bash completion script for openqa-cli."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-client-bash-completion-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "8396616ab5ea6372098dd70b9020440e5ef3b47e7f1f454528590d264fac4f4ad07ebf152f6cebb8470244e906a0dbf266786c91d2ac3c87980d01e225e1a049"

RPROVIDES:${PN} += "openQA-client-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
