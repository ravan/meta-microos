SUMMARY = "Trie data structure for Python"
DESCRIPTION = "A trie data structure for Python (2.x and 3.x). Uses libdatrie."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "python313-datrie-0.8.3-1.7.aarch64.rpm"
RPM_HASH = "603fa577ba932fffcab8564104b2a5e0998ef7b49b6c9e5435a9825785773a16ce7bb7dae1bbd8b1db9429c202a5d32735214829587e95f97314e5fa97306314"

RPROVIDES:${PN} += "python3-datrie \
python3.13dist-datrie \
python313-datrie \
python3dist-datrie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
