SUMMARY = "Read single characters and key-strokes"
DESCRIPTION = "Read single characters and key-strokes"
LICENSE = "MIT"

PV = "0.6.5"

RPM_NAME = "python313-getkey-0.6.5-1.7.noarch.rpm"
RPM_HASH = "7db185e54235f82b06ce9c93a5b944cba31a2add1ba39eada3b89f36975d84f7ced4e4120155176249a8f915c8868fc4c39c792af95ba32919b26456c71b3103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-getkey \
python3.13dist-getkey \
python313-getkey \
python3dist-getkey"

RDEPENDS:${PN} += "python-abi"

inherit rpm
