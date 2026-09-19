SUMMARY = "MS Azure Communication Network Traversal Service Client Library for Python"
DESCRIPTION = "Azure Communication Network Traversal is managing TURN credentials for Azure Communication Services. \
 \
It will provide TURN credentials to a user."
LICENSE = "MIT"

PV = "1.1.0~b1"

RPM_NAME = "python314-azure-communication-networktraversal-1.1.0~b1-2.9.noarch.rpm"
RPM_HASH = "15a90d5afc98398d5fe3a5b12d7f85cea6c0d2771032765b3a19823a07de3bd240705c83e7fe62a17bb66a84b19ce1dc2b32066a0ec10179e8851a86c736faa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-networktraversal \
python314-azure-communication-networktraversal \
python3dist-azure-communication-networktraversal"

RDEPENDS:${PN} += "-python314-azure-core >= 1.19.1 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
