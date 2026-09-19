SUMMARY = "Transaction management for Python"
DESCRIPTION = "This package contains a generic transaction implementation for Python. It is \
mainly used by the ZODB, though. \
 \
Note that the data manager API, transaction.interfaces.IDataManager, is \
syntactically simple, but semantically complex. The semantics were not easy to \
express in the interface. This could probably use more work. The semantics are \
presented in detail through examples of a sample data manager in \
transaction.tests.test_SampleDataManager."
LICENSE = "ZPL-2.1"

PV = "5.1"

RPM_NAME = "python313-transaction-5.1-1.3.noarch.rpm"
RPM_HASH = "9d6dc769cd9e439b99f15df535c6b549dee3ca7f215d07d45b2b6710938676d1607ed3dcb7e701ca49ec69eaa8ea26727fcbc65a534008331a3e29175c9adb39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-transaction \
python3.13dist-transaction \
python313-transaction \
python3dist-transaction"

RDEPENDS:${PN} += "python-abi \
python313-zope.interface"

inherit rpm
