SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.10.5"

RPM_NAME = "python313-jira-3.10.5-1.4.noarch.rpm"
RPM_HASH = "487b9c07e3a566077452869e7c7c4ec06643f7b1a2fd11a27ebd7ae4b90701688b4886abd31e5b598adf4d03ba9861aefb5bfb504b5e59fb25cb6c4bccf945d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jira \
python3.13dist-jira \
python313-jira \
python3dist-jira"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Pillow \
python313-defusedxml \
python313-keyring \
python313-oauthlib \
python313-packaging \
python313-requests \
python313-requests-oauthlib \
python313-requests-toolbelt \
python313-typing-extensions"

inherit rpm
