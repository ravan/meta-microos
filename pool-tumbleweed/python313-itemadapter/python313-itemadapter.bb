SUMMARY = "Wrapper for data container objects"
DESCRIPTION = "The ItemAdapter class is a wrapper for data container objects, providing \
a common interface to handle objects of different types in an uniform \
manner, regardless of their underlying implementation."
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python313-itemadapter-0.13.1-2.1.noarch.rpm"
RPM_HASH = "d7f0d04e71da1de19c38f54f2cb4754dd2653847fb3f33d2816879cfcd588fc5aead5448a752f1c6ae773af60a0e113ce0e3f7faad31bb202149e3a22ebe2f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-itemadapter \
python3.13dist-itemadapter \
python313-itemadapter \
python3dist-itemadapter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
