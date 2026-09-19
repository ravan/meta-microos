SUMMARY = "Azure Identity client library for Python"
DESCRIPTION = "Azure Identity authenticating with Azure Active Directory for Azure SDK \
libraries. It provides credentials Azure SDK clients can use to authenticate \
their requests."
LICENSE = "MIT"

PV = "1.25.3"

RPM_NAME = "python314-azure-identity-1.25.3-1.3.noarch.rpm"
RPM_HASH = "faafef3383b91e340b9a4e4cb6370761574c96a37b3dcadd8b50d695c45966664622d729367dcbde60bbaa23e436babedc8acaa196c28edb11911a763aa0177f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-identity \
python314-azure-identity \
python3dist-azure-identity"

RDEPENDS:${PN} += "-python314-azure-core >= 1.31.0 with python314-azure-core < 2.0.0 \
-python314-msal >= 1.35.1 with python314-msal < 2.0.0 \
-python314-msal-extensions >= 1.2.0 with python314-msal-extensions < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-cryptography \
python314-typing-extensions"

inherit rpm
