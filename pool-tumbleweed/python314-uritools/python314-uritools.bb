SUMMARY = "URI parsing, classification and composition"
DESCRIPTION = "URI parsing, classification and composition."
LICENSE = "MIT"

PV = "6.1.1"

RPM_NAME = "python314-uritools-6.1.1-1.2.noarch.rpm"
RPM_HASH = "0f8c24c9361b0231ba172ffe4f01b76710475128637e137b9e66c4c9131f104b9e92ba0edd5f7c9dd033cd63f5411554c8b9f5ca39ef16b30e59370e1e88e970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uritools \
python314-uritools \
python3dist-uritools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
