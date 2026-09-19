SUMMARY = "Fish Completion for kompose"
DESCRIPTION = "Fish command line completion support for kompose."
LICENSE = "Apache-2.0"

PV = "1.38.0"

RPM_NAME = "kompose-fish-completion-1.38.0-1.7.noarch.rpm"
RPM_HASH = "6ec982749dc8864694b097b1b4854b0fb208457ce6fae68ce80c8e2a4024e9a2ab9bbbb34f28bb9acc1d6e200b6d4a56daabd138a725c32c1267045aa7892b5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kompose-fish-completion"

RDEPENDS:${PN} += "kompose"

inherit rpm
