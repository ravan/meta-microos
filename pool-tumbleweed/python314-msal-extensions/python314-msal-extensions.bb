SUMMARY = "Microsoft Authentication Library (MSAL) for Python Extensions"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect. \
 \
This packages contains additional extensions."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python314-msal-extensions-1.3.1-1.5.noarch.rpm"
RPM_HASH = "03fe7752207ec2785b0d234f7c9c604692b40faa7deb0dd72da5f19f173bf4d4c1d09f5e8a9ee132f5a33427736f47296f0741f79ba6f8285b1d60408dd74b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-msal-extensions \
python314-msal-extensions \
python3dist-msal-extensions"

RDEPENDS:${PN} += "-python314-msal >= 1.29 with python314-msal < 2.0 \
-python314-portalocker >= 1.4 with python314-portalocker < 4.0 \
python-abi"

inherit rpm
