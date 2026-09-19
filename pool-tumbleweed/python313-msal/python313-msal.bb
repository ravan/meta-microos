SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.37.0"

RPM_NAME = "python313-msal-1.37.0-1.2.noarch.rpm"
RPM_HASH = "4fcdc0799e9685b156d210d5e7488bf6b713bfd6f2e6ec718958bc11f61f6988b140d6eabd4c65b9044d40034a260961a9a6d0048c840bf6e8af769fdf7998f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msal \
python3.13dist-msal \
python313-msal \
python3dist-msal"

RDEPENDS:${PN} += "python-abi \
python313-PyJWT \
python313-cryptography \
python313-requests"

inherit rpm
