SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.37.0"

RPM_NAME = "python314-msal-1.37.0-1.2.noarch.rpm"
RPM_HASH = "169bd9e2fe1c72e8ef899e057a5667ccaf1aa79faa6465a7cd376622b207dd67b934437c9327136710b52f49927390323d36c9e6a1fe0484e687c4a66ed64b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-msal \
python314-msal \
python3dist-msal"

RDEPENDS:${PN} += "python-abi \
python314-PyJWT \
python314-cryptography \
python314-requests"

inherit rpm
