SUMMARY = "Utilities not included with the standard Python install"
DESCRIPTION = "Python Utils is a collection of Python functions and \
classes which make common patterns shorter and easier."
LICENSE = "BSD-3-Clause"

PV = "3.9.1"

RPM_NAME = "python313-python-utils-3.9.1-1.5.noarch.rpm"
RPM_HASH = "532ddcca4e774f09d4422419a8f57fef3c5dc93b55a66871721abcdd230bf7c31b22ff7c93eebbe4068188ee950c587b4431e7c45876bc77cdeb5fa6cd64bebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-utils \
python3.13dist-python-utils \
python313-python-utils \
python3dist-python-utils"

RDEPENDS:${PN} += "python-abi \
python313-loguru \
python313-typing-extensions"

inherit rpm
