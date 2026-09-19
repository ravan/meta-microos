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

RPM_NAME = "python314-transaction-5.1-1.3.noarch.rpm"
RPM_HASH = "ffff50e26b7025c5208fa543a94349fb1dbd37c044600a1f44c9d53059f25b4365a6dc407b54f181ff8e6d2e71d7b4c3ef37c96fd7007cba83e01f7f05c1bd3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-transaction \
python314-transaction \
python3dist-transaction"

RDEPENDS:${PN} += "python-abi \
python314-zope.interface"

inherit rpm
