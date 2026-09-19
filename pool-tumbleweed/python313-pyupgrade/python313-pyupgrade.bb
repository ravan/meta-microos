SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.21.2"

RPM_NAME = "python313-pyupgrade-3.21.2-1.4.noarch.rpm"
RPM_HASH = "14ff79e61b495882787bbc46507119e80b5b154407b7739f4601414244cab2f9aec6ce3bb81f610c71dfae52830ead440aff225c05cfa056546b4fa43b15d5af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyupgrade \
python3.13dist-pyupgrade \
python313-pyupgrade \
python3dist-pyupgrade"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-tokenize-rt \
update-alternatives"

inherit rpm
