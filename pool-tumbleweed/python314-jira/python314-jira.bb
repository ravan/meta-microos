SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.10.5"

RPM_NAME = "python314-jira-3.10.5-1.4.noarch.rpm"
RPM_HASH = "cc2f99c1f6b6891648898f995658c5f95145447cefbbef4de057eb4dd809adeea99a6bcfc48f97ebbbf4ce8926134340f8cd523492b49c08121290f116d2f343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jira \
python314-jira \
python3dist-jira"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Pillow \
python314-defusedxml \
python314-keyring \
python314-oauthlib \
python314-packaging \
python314-requests \
python314-requests-oauthlib \
python314-requests-toolbelt \
python314-typing-extensions"

inherit rpm
