SUMMARY = "Python bindings for the remote Jenkins API"
DESCRIPTION = "This package provides Python bindings for the Jenkins Remote \
API. It currently supports management of: \
 * Project configuration \
 * Build control \
 * Slave node configuration"
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "python313-python-jenkins-1.8.3-1.2.noarch.rpm"
RPM_HASH = "22e9f363cf7b1c330153274f4d91cc068dd38e4edd9bea93322ab01ce3489aa775d1ae60b65a3de57584035388ba622ebf94f3d87f946389f04c4cd852b10c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jenkins \
python3-python-jenkins \
python3.13dist-python-jenkins \
python313-jenkins \
python313-python-jenkins \
python3dist-python-jenkins"

RDEPENDS:${PN} += "python-abi \
python313-multi-key-dict \
python313-pbr \
python313-requests"

inherit rpm
