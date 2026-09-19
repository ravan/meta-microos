SUMMARY = "Google authentication library"
DESCRIPTION = "This library provides oauthlib integration with google-auth."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python313-google-auth-oauthlib-1.4.1-1.1.noarch.rpm"
RPM_HASH = "885ce0b290fa5cf57814ec66dd816dca7e8e1be08e0ad6ee10b6aed18f97fdda33a7fb09ec73a6ad4ad9c1ecbcb0d32e410790575e68dbb7aedb75c30c075bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-auth-oauthlib \
python3.13dist-google-auth-oauthlib \
python313-google-auth-oauthlib \
python3dist-google-auth-oauthlib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-google-auth \
python313-requests-oauthlib \
update-alternatives"

inherit rpm
