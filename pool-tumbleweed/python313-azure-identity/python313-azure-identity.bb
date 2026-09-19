SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.25.3"

RPM_NAME = "python313-azure-identity-1.25.3-1.3.noarch.rpm"
RPM_HASH = "e565b608f3cb23c9a37f5084db9b9683e29a82e58a18f23c904017dbbc63598aaaf8ade617018bb2fb334f82efada3baa7573de61dd99cf47710677c186fd29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-identity \
python3.13dist-azure-identity \
python313-azure-identity \
python3dist-azure-identity"

RDEPENDS:${PN} += "-python313-azure-core >= 1.31.0 with python313-azure-core < 2.0.0 \
-python313-msal >= 1.35.1 with python313-msal < 2.0.0 \
-python313-msal-extensions >= 1.2.0 with python313-msal-extensions < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-cryptography \
python313-typing-extensions"

inherit rpm
