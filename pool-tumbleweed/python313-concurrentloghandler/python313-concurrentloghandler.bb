SUMMARY = "Concurrent logging handler"
DESCRIPTION = "This module provides an additional log handler for Python's \
standard logging package (PEP 282). This handler will write log \
events to log file which is rotated when the log file reaches \
a certain size. Multiple processes can safely write to the same \
log file concurrently."
LICENSE = "Apache-2.0"

PV = "0.9.19"

RPM_NAME = "python313-concurrentloghandler-0.9.19-3.5.noarch.rpm"
RPM_HASH = "7ddcfae05770e33a2f14b723dbaa63f8b147279a2be3c2fbe00a541a074e74e0880092466c011d89229fec81ae5679f5f80b29d91573ee8a6266347285cb7c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-concurrentloghandler \
python3.13dist-concurrent-log-handler \
python313-concurrentloghandler \
python3dist-concurrent-log-handler"

RDEPENDS:${PN} += "python-abi \
python313-portalocker"

inherit rpm
