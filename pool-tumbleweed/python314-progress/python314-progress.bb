SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "python314-progress-1.6.1-1.5.noarch.rpm"
RPM_HASH = "4acac80b05df9d8e13ba4d0e33c906d04eca2412546d96abb91a83e993ee587007745e30f6d2d8a48ab3470fad1690b0696739b18cce916503c58e05d00f0fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-progress \
python314-progress \
python3dist-progress"

RDEPENDS:${PN} += "python-abi"

inherit rpm
