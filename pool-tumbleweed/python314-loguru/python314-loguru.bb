SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python314-loguru-0.7.3-4.2.noarch.rpm"
RPM_HASH = "4708895d7342fd9339e71f7f53e5451f8b7c4c0541200200f1654171702e1c5501ca44ae14d5bac8fd7b408e6af8a692ad1249cdaccfb80468e3fd32d701253b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-loguru \
python314-loguru \
python3dist-loguru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
