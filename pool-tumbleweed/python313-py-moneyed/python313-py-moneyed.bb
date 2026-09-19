SUMMARY = "Python currency and money classes"
DESCRIPTION = "Provides Currency and Money classes for use in your Python code."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python313-py-moneyed-3.0-3.7.noarch.rpm"
RPM_HASH = "f6d882871ab3bc3e1446c84aeca0bd7723322c23710365b18daca8c6f345d98d8a9caf4a1ee5bb9fe9294ee6c2b04341e51365bc9417dbcf5917ee683af90824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-moneyed \
python3.13dist-py-moneyed \
python313-py-moneyed \
python3dist-py-moneyed"

RDEPENDS:${PN} += "python-abi \
python313-Babel \
python313-typing-extensions"

inherit rpm
