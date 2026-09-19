SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.37.0"

RPM_NAME = "python314-referencing-0.37.0-2.5.noarch.rpm"
RPM_HASH = "e84fcf52048dcaaff8f0cf6be29ad4d07bebd9cddf1aadbaacd62cfe396ba4ab8dacdab3375247a54d3c251716108214c9f48ce7dbd936940ec9fe99b503d2b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-referencing \
python314-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-rpds-py \
python314-typing-extensions"

inherit rpm
