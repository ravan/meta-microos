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

RPM_NAME = "python313-BTrees-6.4-1.3.aarch64.rpm"
RPM_HASH = "16466483e710fcb705f422ce3a8ff7a76c2fdd821e505ebbca62f71854a2f47446b05fee94f2f888a23fbe7a7866778d309997ef0d65b7c9fda764e9729e1e2a"

RPROVIDES:${PN} += "python3-BTrees \
python3-BTrees-doc \
python3.13dist-btrees \
python313-BTrees \
python313-BTrees-doc \
python3dist-btrees"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-persistent \
python313-zope.interface"

inherit rpm
