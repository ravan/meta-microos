SUMMARY = "Persistent, Functional, Immutable data structures"
DESCRIPTION = "Pyrsistent is a number of persistent collections \
(by some referred to as functional data structures). \
Persistent in  the sense that they are immutable. \
 \
All methods on a data structure that would normally \
mutate it instead return a new copy of the structure \
containing the requested updates. The original structure \
is left untouched."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python313-pyrsistent-0.20.0-3.11.aarch64.rpm"
RPM_HASH = "c3a024dcfa7b01c0e29f245c055b54707cb03c687d5a1daa825f9beee7bb0aa08c4e3ffbc0e32a203ae93a8c03f7dcd1ceee998e05824376f83cac4f10a38a2a"

RPROVIDES:${PN} += "python3-pyrsistent \
python3.13dist-pyrsistent \
python313-pyrsistent \
python3dist-pyrsistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
