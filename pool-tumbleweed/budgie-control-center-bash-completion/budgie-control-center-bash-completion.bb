SUMMARY = "Bash Completion for Budgie Control Center"
DESCRIPTION = "This package contains the Bash Completion for Budgie Control Center"
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "2.1.0+0"

RPM_NAME = "budgie-control-center-bash-completion-2.1.0+0-1.3.aarch64.rpm"
RPM_HASH = "27bfcb7a05f628e08475c151e18c9772c4d6d5e1997b5fb1801d4c12066368bfe4e5668d1baef1004ee84983f132d9f1e7a8ae78ac7f12b592e8355a4c012c9d"

RPROVIDES:${PN} += "budgie-control-center-bash-completion"

RDEPENDS:${PN} += "bash-completion \
budgie-control-center"

inherit rpm
