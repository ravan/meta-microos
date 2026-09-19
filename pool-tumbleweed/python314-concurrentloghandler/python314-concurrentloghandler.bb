SUMMARY = "Concurrent logging handler"
DESCRIPTION = "This module provides an additional log handler for Python's \
standard logging package (PEP 282). This handler will write log \
events to log file which is rotated when the log file reaches \
a certain size. Multiple processes can safely write to the same \
log file concurrently."
LICENSE = "Apache-2.0"

PV = "0.9.19"

RPM_NAME = "python314-concurrentloghandler-0.9.19-3.5.noarch.rpm"
RPM_HASH = "743e10cf01d6d752804b9ffc384c83ddac1e736ba2184262c6af34063eacd182c73d85c04368df7b092469a0651d6f2784ea762a83f1d3f8e4968d93f0a834d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-concurrent-log-handler \
python314-concurrentloghandler \
python3dist-concurrent-log-handler"

RDEPENDS:${PN} += "python-abi \
python314-portalocker"

inherit rpm
