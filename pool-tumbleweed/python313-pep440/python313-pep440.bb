SUMMARY = "Check whether versions number match PEP 440"
DESCRIPTION = "A simple package with utils to check whether versions number match Pep 440."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-pep440-0.1.2-1.17.noarch.rpm"
RPM_HASH = "80d6a4bcc233d2b660d188641c96ae1eb8556e52c2423fea4263075890e46ec0bcdd07aaf68b7d774f096018d80e8db982a66c20cbaf2f549cdc32caa598f865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep440 \
python3.13dist-pep440 \
python313-pep440 \
python3dist-pep440"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
