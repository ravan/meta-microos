SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.9"

RPM_NAME = "python313-duet-0.2.9-2.5.noarch.rpm"
RPM_HASH = "c7444a4a4a3e5b6b4b09b1e7827871254c7ad5d14e36988031fa2f0062589f51351b0ebd961a82a859820aaca44ceb2dd1636a34811fb1b036bb41c23af34e02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-duet \
python3.13dist-duet \
python313-duet \
python3dist-duet"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
