SUMMARY = "OAuthlib authentication support for Requests"
DESCRIPTION = "This project provides first-class OAuth library support for Requests."
LICENSE = "ISC"

PV = "2.0.0"

RPM_NAME = "python313-requests-oauthlib-2.0.0-2.3.noarch.rpm"
RPM_HASH = "ead8e4c125a8ac69df9d4b18d2db49d1d2e3299377cc7cacf72af3976b8ff0a9ddd646412606496c2384e62a2d5b28b38573ae82b96378ba82bf3e0f9eafd8df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-oauthlib \
python3.13dist-requests-oauthlib \
python313-requests-oauthlib \
python3dist-requests-oauthlib"

RDEPENDS:${PN} += "python-abi \
python313-oauthlib \
python313-requests"

inherit rpm
