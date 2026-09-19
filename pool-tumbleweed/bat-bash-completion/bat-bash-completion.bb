SUMMARY = "Bash completion for bat"
DESCRIPTION = "Bash command line completion support for bat."
LICENSE = "Apache-2.0 | MIT"

PV = "0.26.1"

RPM_NAME = "bat-bash-completion-0.26.1-2.2.noarch.rpm"
RPM_HASH = "59ff0180884f34fb05fbb274b71ad644364d2664871a42e62831730e4a9ba645744ca1c172d4d63f16d49c1c78b3457aa3003788fd5beb00b79eaa8c841aac76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-bash-completion"

RDEPENDS:${PN} += "bat"

inherit rpm
