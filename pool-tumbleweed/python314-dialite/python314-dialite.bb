SUMMARY = "Python library to show simple dialogs"
DESCRIPTION = "Dialite is a pure Python package to show dialogs. It provides a \
handful of functions, each a verb, that can be used to inform(), \
warn() or fail() the user, or to ask_ok(), ask_retry() or \
ask_yesno(). \
 \
Dialite can show graphical dialogs, and falls back to a terminal \
interface if dialogs are unavailable (e.g. if not supported by the \
platform, or for SSH connections)."
LICENSE = "BSD-2-Clause"

PV = "0.6.0"

RPM_NAME = "python314-dialite-0.6.0-1.7.noarch.rpm"
RPM_HASH = "c4a392442ae4d4c9729b45c77dd624bbcb4c4f5e36fbbd59a0d2cd655feef51e8a48f89c4185c061ea98de5126bfe2d6442251a86ea56801f248d3c308915e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dialite \
python314-dialite \
python3dist-dialite"

RDEPENDS:${PN} += "python-abi"

inherit rpm
