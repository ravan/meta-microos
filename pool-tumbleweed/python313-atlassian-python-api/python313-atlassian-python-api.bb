SUMMARY = "Python Atlassian REST API Wrapper"
DESCRIPTION = "Python Atlassian REST API Wrapper"
LICENSE = "Apache-2.0"

PV = "4.0.7"

RPM_NAME = "python313-atlassian-python-api-4.0.7-1.4.noarch.rpm"
RPM_HASH = "e701464f5cbc4967ffe7be7f38140d9c1b844d86607b1b4fb8dfadd2f5fb0efdf4d5236bd9eae47febd6474db0ed1e07a6c67643aac5a5ce63b0fef3b513ceb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-atlassian-python-api \
python3.13dist-atlassian-python-api \
python313-atlassian-python-api \
python3dist-atlassian-python-api"

RDEPENDS:${PN} += "python-abi \
python313-beautifulsoup4 \
python313-deprecated \
python313-jmespath \
python313-oauthlib \
python313-requests \
python313-requests-oauthlib \
python313-typing-extensions"

inherit rpm
