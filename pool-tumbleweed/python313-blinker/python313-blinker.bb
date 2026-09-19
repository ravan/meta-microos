SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python313-blinker-1.9.0-1.9.noarch.rpm"
RPM_HASH = "0391e88b5e52dd86ac726529c7803d7ed26f5e34f576982803225d3c1dc6900b43557832982aaee13e430efe3a6f882f33a49e9eb09e8a1b2e74681b89a7689b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blinker \
python3.13dist-blinker \
python313-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
