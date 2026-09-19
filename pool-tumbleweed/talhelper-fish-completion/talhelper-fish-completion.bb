SUMMARY = "Fish Completion for talhelper"
DESCRIPTION = "Fish command line completion support for talhelper."
LICENSE = "BSD-3-Clause"

PV = "3.1.17"

RPM_NAME = "talhelper-fish-completion-3.1.17-1.1.noarch.rpm"
RPM_HASH = "97626888a323bad58f2d7baf467dc72640efa755bf177a046980f692639c01bb287d7c83fc3102430236683cbeaa3369ec95aa4f72fa63d11b920de0155f76a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "talhelper-fish-completion"

RDEPENDS:${PN} += "talhelper"

inherit rpm
