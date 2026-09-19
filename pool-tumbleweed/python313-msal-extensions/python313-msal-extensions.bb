SUMMARY = "Microsoft Authentication Library (MSAL) for Python Extensions"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect. \
 \
This packages contains additional extensions."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python313-msal-extensions-1.3.1-1.5.noarch.rpm"
RPM_HASH = "8d818987698f17462f33d58dd0efefaccd846fb02e32a6a39d36980c49e4db36f27aa878e4f9890f50057e7c0cdde390cc72d1409db23e27a45097ddfedc7712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msal-extensions \
python3.13dist-msal-extensions \
python313-msal-extensions \
python3dist-msal-extensions"

RDEPENDS:${PN} += "-python313-msal >= 1.29 with python313-msal < 2.0 \
-python313-portalocker >= 1.4 with python313-portalocker < 4.0 \
python-abi"

inherit rpm
