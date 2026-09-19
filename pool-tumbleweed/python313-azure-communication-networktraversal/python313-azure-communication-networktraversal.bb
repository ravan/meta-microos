SUMMARY = "MS Azure Communication Network Traversal Service Client Library for Python"
DESCRIPTION = "Azure Communication Network Traversal is managing TURN credentials for Azure Communication Services. \
 \
It will provide TURN credentials to a user."
LICENSE = "MIT"

PV = "1.1.0~b1"

RPM_NAME = "python313-azure-communication-networktraversal-1.1.0~b1-2.9.noarch.rpm"
RPM_HASH = "ba15a56136b9e0f4f697769ac568184e9ededd92a670559519a80d8c92c236154af7c548ba56c3d5bf28918baeb3456435bc88f34dc0b3c41680c6f026348821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-communication-networktraversal \
python3.13dist-azure-communication-networktraversal \
python313-azure-communication-networktraversal \
python3dist-azure-communication-networktraversal"

RDEPENDS:${PN} += "-python313-azure-core >= 1.19.1 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-communication-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
