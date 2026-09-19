SUMMARY = "Check whether versions number match PEP 440"
DESCRIPTION = "A simple package with utils to check whether versions number match Pep 440."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python314-pep440-0.1.2-1.17.noarch.rpm"
RPM_HASH = "8cfdfe6c9a89b5dddf275b51236d3b0ab310a1b24e6d9a78e26031729411977fbfe34a535f2f18a15c0c4039d9962b2a5daf62fff51b029c682ab663e1a07ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pep440 \
python314-pep440 \
python3dist-pep440"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
