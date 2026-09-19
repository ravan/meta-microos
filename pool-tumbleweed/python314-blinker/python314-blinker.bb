SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python314-blinker-1.9.0-1.9.noarch.rpm"
RPM_HASH = "1832366681abb9c1a83edc535a0cdc7d32585f963dc307e674272650095fdf74027af3dcc7d82d1d03f80128f20e82a822a34e2461deaaf164a3c56816edd5d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-blinker \
python314-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
