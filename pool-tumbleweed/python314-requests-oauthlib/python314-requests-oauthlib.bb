SUMMARY = "OAuthlib authentication support for Requests"
DESCRIPTION = "This project provides first-class OAuth library support for Requests."
LICENSE = "ISC"

PV = "2.0.0"

RPM_NAME = "python314-requests-oauthlib-2.0.0-2.3.noarch.rpm"
RPM_HASH = "66e5239cadd2159094d62ebaf1a995cd40b5601d97413f83aae5a36d80c21b44ed749af62d696c373698049a29625109f3fafe49a335b7bce11f27ecf3bceeb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-oauthlib \
python314-requests-oauthlib \
python3dist-requests-oauthlib"

RDEPENDS:${PN} += "python-abi \
python314-oauthlib \
python314-requests"

inherit rpm
