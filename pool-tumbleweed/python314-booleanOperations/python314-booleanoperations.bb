SUMMARY = "Boolean operations on paths"
DESCRIPTION = "Boolean operations on paths."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python314-booleanOperations-0.10.0-1.5.noarch.rpm"
RPM_HASH = "b4783184c515e3ebf591d8aabeb460add62a509b436663ce530e7d8399ac15f508cc3ed8f619c4a183439f9b0366374d26b3dc3a2a920f8ea0b745013f1241d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-booleanoperations \
python314-booleanOperations \
python3dist-booleanoperations"

RDEPENDS:${PN} += "python-abi \
python314-FontTools \
python314-pyclipper"

inherit rpm
