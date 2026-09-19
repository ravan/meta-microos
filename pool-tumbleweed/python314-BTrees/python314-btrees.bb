SUMMARY = "Persistent B-tree object containers for Python"
DESCRIPTION = "This package contains a generic BTrees implementation for Python. It is \
mainly used by the ZODB, though. \
 \
Note that the data manager API, BTrees.interfaces.IDataManager, is \
syntactically simple, but semantically complex. The semantics were not easy to \
express in the interface. This could probably use more work. The semantics are \
presented in detail through examples of a sample data manager in \
BTrees.tests.test_SampleDataManager."
LICENSE = "ZPL-2.1"

PV = "6.4"

RPM_NAME = "python314-BTrees-6.4-1.3.aarch64.rpm"
RPM_HASH = "40014232c7bddcd4f9acc12d2e4ba77b1354c9e30aa77f3abfa83159e3a27045afbc9d2d4641f09ab1b00c9d790d9f2039ae3d970a3d554efdcf2b8a4e84abeb"

RPROVIDES:${PN} += "python3.14dist-btrees \
python314-BTrees \
python314-BTrees-doc \
python3dist-btrees"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-persistent \
python314-zope.interface"

inherit rpm
