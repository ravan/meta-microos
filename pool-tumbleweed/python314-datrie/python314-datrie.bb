SUMMARY = "Trie data structure for Python"
DESCRIPTION = "A trie data structure for Python (2.x and 3.x). Uses libdatrie."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "python314-datrie-0.8.3-1.7.aarch64.rpm"
RPM_HASH = "0d5dce12348df70426e6c5c274f5aa25188b4e80267750a55cbfc870cec6289d9d968a14662df821d600b4c4c25f92284c704b11f1fe1e6c527d44a7968fce6a"

RPROVIDES:${PN} += "python3.14dist-datrie \
python314-datrie \
python3dist-datrie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
