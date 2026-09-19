SUMMARY = "Python Atlassian REST API Wrapper"
DESCRIPTION = "Python Atlassian REST API Wrapper"
LICENSE = "Apache-2.0"

PV = "4.0.7"

RPM_NAME = "python314-atlassian-python-api-4.0.7-1.4.noarch.rpm"
RPM_HASH = "168a4b64bbba50acf623e9e1446861ad911f9c7fe38252a19b3796995b5bf149d1d04d65ca41a6db5cbf4db18bcd3263f2923c0f3d7ac56ab0b3ac2c8448f497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-atlassian-python-api \
python314-atlassian-python-api \
python3dist-atlassian-python-api"

RDEPENDS:${PN} += "python-abi \
python314-beautifulsoup4 \
python314-deprecated \
python314-jmespath \
python314-oauthlib \
python314-requests \
python314-requests-oauthlib \
python314-typing-extensions"

inherit rpm
